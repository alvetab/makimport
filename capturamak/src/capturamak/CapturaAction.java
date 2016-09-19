package capturamak;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.persistence.criteria.CriteriaBuilder.Case;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;
import com.sun.prism.paint.Gradient;

import JPA.UrlscapturaJpaDAO;
import entities.Urlscaptura;

public class CapturaAction implements Runnable {

	private String accion;
	private static CapturaAction capturaaccion;
	private Properties properties;
	private static int capturando = 0;
	private String urls;
	private static int tipo = 0;
	private static ArrayList<String> listafinal;

	// El constructor es privado, no permite que se genere un constructor por
	// defecto.
	private CapturaAction(String accion, Properties properties) {
		this.accion = accion;
		this.properties = properties;
		System.out.println("accion a realizar: " + this.accion);
	}

	public CapturaAction() {
	}

	public static CapturaAction getSingletonInstance(String accion, Properties properties) {
		if (capturaaccion == null) {
			capturaaccion = new CapturaAction(accion, properties);
		} else {
			System.out.println("Espera a que finalicen las capturas antes de volver a iniciar el proceso:" + accion);
		}
		return capturaaccion;
	}

	@Override
	public CapturaAction clone() {
		try {
			throw new CloneNotSupportedException();
		} catch (CloneNotSupportedException ex) {
			System.out.println("No se puede clonar un objeto de la clase SoyUnico");
		}
		return null;
	}// metodos getter y setter

	public CapturaAction(String urls, int tipo) {
		this.urls = urls;
		this.tipo = tipo;
	}

	public void captura() throws InterruptedException {
		listafinal = new ArrayList<String>();
		if (capturando == 1) {
			System.out.println("ya hay un proceso de captura en marcha");
		} else {
			if (properties.getProperty("CWM").contains("false")) {
				System.out.println("No va a capturar Datos generales Makita");
			} else {
				if (properties.getProperty("CWMSN").contains("false")) {
					System.out.println("captura todo Makita");
					String urls = new String(properties.getProperty("WEB_MAKITA"));
					System.out.println(urls);
					CapturaAction rt1 = new CapturaAction(urls, 1);
					Thread t1 = new Thread(rt1);
					t1.start();
					t1.join();
				} else {
					System.out.println("captura nuevos Makita");
				}
			}

			//

			if (properties.getProperty("CWD").contains("false")) {
				System.out.println("No va a capturar Datos generales Dolmar");
			} else {
				if (properties.getProperty("CWDSN").contains("false")) {
					System.out.println("captura todo Dolmar");
					String urls = new String(properties.getProperty("WEB_DOLMAR"));
					System.out.println(urls);
					CapturaAction rt2 = new CapturaAction(urls, 2);
					Thread t2 = new Thread(rt2);
					t2.start();
					t2.join();
				} else {
					System.out.println("captura nuevos Dolmar");

				}
			}

			//

			if (properties.getProperty("CNM").contains("false")) {
				System.out.println("No va a capturar Novedades Makita");
			} else {
				if (properties.getProperty("CNMSN").contains("false")) {
					System.out.println("captura Novedades Makita");
					String urls = new String(properties.getProperty("NOVEDAD_MAKITA"));
					System.out.println(urls);
					CapturaAction rt3 = new CapturaAction(urls, 3);
					Thread t3 = new Thread(rt3);
					t3.start();
					t3.join();

					// ArrayList<String> listadourls =
					// listasurls.capturaurls(properties.getProperty("NOVEDAD_MAKITA"));
				} else {
					System.out.println("captura solo cambios en Novedades Makita");
				}
			}

			//
			if (properties.getProperty("CND").contains("false")) {
				System.out.println("No va a capturar Novedades Dolmar");
			} else {
				if (properties.getProperty("CNDSN").contains("false")) {
					System.out.println("captura Novedades Dolmar");
					String urls = new String(properties.getProperty("NOVEDAD_DOLMAR"));
					System.out.println(urls);
					CapturaAction rt4 = new CapturaAction(urls, 4);
					Thread t4 = new Thread(rt4);
					t4.start();
					t4.join();

					ArrayList<String> listadourls = listasurls.capturaurls(properties.getProperty("NOVEDAD_DOLMAR"));
				} else {
					System.out.println("captura solo cambios en Novedades Dolmar");
				}
			}

			//
			if (properties.getProperty("CAM").contains("false")) {
				System.out.println("No va a capturar Artículos Makita");
			} else {
				if (properties.getProperty("CAMSN").contains("false")) {
					System.out.println("captura Artículos Makita");
					String urls = new String(properties.getProperty("ACCESORIO_MAKITA"));
					System.out.println(urls);
					CapturaAction rt5 = new CapturaAction(urls, 5);
					Thread t5 = new Thread(rt5);
					t5.start();
					t5.join();
				} else {
					System.out.println("captura solo cambios en Artículos Makita");
				}
			}

			//
			if (properties.getProperty("CAD").contains("false")) {
				System.out.println("No va a capturar Artículos Dolmar");
			} else {
				if (properties.getProperty("CADSN").contains("false")) {
					System.out.println("captura Artículos dolmar");
					String urls = new String(properties.getProperty("ACCESORIO_DOLMAR"));
					System.out.println(urls);
					CapturaAction rt6 = new CapturaAction(urls, 6);
					Thread t6 = new Thread(rt6);
					t6.start();
					t6.join();
				} else {
					System.out.println("captura solo cambios en Artículos Dolmar");
				}
			}

			//
			if (properties.getProperty("COP").contains("false")) {
				System.out.println("No va a capturar Artículos sueltos");
			} else {
				if (properties.getProperty("COPSN").contains("false")) {
					System.out.println("captura Artículos sueltos");
					String urls = new String(properties.getProperty("PRODUCTOS_SUELTOS"));
					System.out.println(urls);
					CapturaAction rt7 = new CapturaAction(urls, 7);
					Thread t7 = new Thread(rt7);
					t7.start();
					t7.join();
				} else {
					System.out.println("captura solo Articulos sueltos nuevos");
				}
			}

			//

			//
			if (properties.getProperty("CDM").contains("false")) {
				System.out.println("No va a capturar despieces Makita");
			} else {
				if (properties.getProperty("CDMSN").contains("false")) {
					System.out.println("captura despieces Makita");
					String urls = new String(properties.getProperty("DESPIECES_MAKITA"));
					System.out.println(urls);
					CapturaAction rt8 = new CapturaAction(urls, 8);
					Thread t8 = new Thread(rt8);
					t8.start();
					t8.join();
				} else {
					System.out.println("captura solo cambios en despieces Makita");
				}
			}

			//
			if (properties.getProperty("CDD").contains("false")) {
				System.out.println("No va a capturar despieces Dolmar");
			} else {
				if (properties.getProperty("CDDSN").contains("false")) {
					System.out.println("captura despieces Dolmar");
					String urls = new String(properties.getProperty("DESPIECES_DOLMAR"));
					System.out.println(urls);
					CapturaAction rt9 = new CapturaAction(urls, 9);
					Thread t9 = new Thread(rt9);
					t9.start();
					t9.join();
				} else {
					System.out.println("captura solo cambios en despieces Dolmar");
				}
			}

			//

			//
			if (properties.getProperty("CMM").contains("false")) {
				System.out.println("No va a capturar mauales Makita");
			} else {
				if (properties.getProperty("CMMSN").contains("false")) {
					System.out.println("captura mauales Makita");
					String urls = new String(properties.getProperty("MANUALES_MAKITA"));
					System.out.println(urls);
					CapturaAction rt10 = new CapturaAction(urls, 10);
					Thread t10 = new Thread(rt10);
					t10.start();
					t10.join();
				} else {
					System.out.println("captura solo cambios en mauales Makita");
				}
			}

			//
			if (properties.getProperty("CMD").contains("false")) {
				System.out.println("No va a capturar mauales Dolmar");
			} else {
				if (properties.getProperty("CMDSN").contains("false")) {
					System.out.println("captura mauales Dolmar");
					String urls = new String(properties.getProperty("MANUALES_DOLMAR"));
					System.out.println(urls);
					CapturaAction rt11 = new CapturaAction(urls, 11);
					Thread t11 = new Thread(rt11);
					t11.start();
					t11.join();
				} else {
					System.out.println("captura solo cambios en maunuales Dolmar");
				}
			}
		}
		Grabarlista(listafinal);
		capturando = 0;
		capturaaccion = null;
		listafinal = null;

	}

	public void botongenerarmaquinas(int tipoparagenerar) throws Exception {
		Urlscaptura url1;
		Parsertipo capturaprimero = new Parsertipo();
		Capturamaquinacompleta actual = null;
		capturaprimero.setrecuperasurls(tipoparagenerar);

		for (int i = 1; i <= capturaprimero.tamanolista(); i++) {
			url1 = capturaprimero.getrecuperaporId(i);
			if (url1.getActivo() && !url1.getCapturado()) {
				String url = url1.getUrl().toString();

				try {
					actual = new Capturamaquinacompleta(url);

					url1.setCapturado(true);
					UrlscapturaJpaDAO emurls = new UrlscapturaJpaDAO();
					emurls.update(url1);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(actual.pestanasdsg());
			} else {
				System.out.println(url1.getUrl().toString() + " ya capturada o producto no activo");
				// url1.setCapturado(false);
				// url1.setActivo(false);
				// UrlscapturaJpaDAO emurls = new UrlscapturaJpaDAO();
				// emurls.update(url1);

			}
		}
	}

	public void generarportipo() throws Exception {
		listafinal = new ArrayList<String>();
		if (capturando == 1) {
			System.out.println("ya hay un proceso de captura en marcha");
		} else {
			if (properties.getProperty("CWM").contains("false")) {
				System.out.println("No va a generar xml ni jpg de Datos generales Makita");
			} else {
				if (properties.getProperty("CWMSN").contains("false")) {
					System.out.println("generar maquinas de todo Makita");
					botongenerarmaquinas(1);
					
				} else {
					System.out.println("generar nuevos Makita");
				}
			}

			//

			if (properties.getProperty("CWD").contains("false")) {
				System.out.println("No va a generar xml ni jpg de Datos generales Dolmar");
			} else {
				if (properties.getProperty("CWDSN").contains("false")) {
					System.out.println("generar maquinas todo Dolmar");
					botongenerarmaquinas(2);
				} else {
					System.out.println("generar nuevos Dolmar");

				}
			}

			//

			if (properties.getProperty("CNM").contains("false")) {
				System.out.println("No va a capturar Novedades Makita");
			} else {
				if (properties.getProperty("CNMSN").contains("false")) {
					System.out.println("generar maquinas  Novedades Makita");
					botongenerarmaquinas(3);
				} else {
					System.out.println("generar solo cambios en Novedades Makita");
				}
			}

			//
			if (properties.getProperty("CND").contains("false")) {
				System.out.println("No va a generar xml ni jpg de Novedades Dolmar");
			} else {
				if (properties.getProperty("CNDSN").contains("false")) {
					System.out.println("generar maquinas Novedades Dolmar");
					botongenerarmaquinas(4);
				} else {
					System.out.println("generar solo cambios en Novedades Dolmar");
				}
			}

			//
			if (properties.getProperty("CAM").contains("false")) {
				System.out.println("No va a generar xml ni jpg de Artículos Makita");
			} else {
				if (properties.getProperty("CAMSN").contains("false")) {
					System.out.println("generar Artículos Makita");
					botongenerarmaquinas(5);
				} else {
					System.out.println("generar solo cambios en Artículos Makita");
				}
			}

			//
			if (properties.getProperty("CAD").contains("false")) {
				System.out.println("No va a generar Artículos Dolmar");
			} else {
				if (properties.getProperty("CADSN").contains("false")) {
					System.out.println("generar Artículos dolmar");
					botongenerarmaquinas(6);
				} else {
					System.out.println("generar solo cambios en Artículos Dolmar");
				}
			}

			//
			if (properties.getProperty("COP").contains("false")) {
				System.out.println("No va a generar xml ni jpg de Artículos sueltos");
			} else {
				if (properties.getProperty("COPSN").contains("false")) {
					System.out.println("generar Artículos sueltos");
					botongenerarmaquinas(7);
				} else {
					System.out.println("generar solo Articulos sueltos nuevos");
				}
			}

			//

			//
			if (properties.getProperty("CDM").contains("false")) {
				System.out.println("No va a generar xml ni jpg de despieces Makita");
			} else {
				if (properties.getProperty("CDMSN").contains("false")) {
					System.out.println("generar despieces Makita");
					botongenerarmaquinas(8);
				} else {
					System.out.println("generar solo cambios en despieces Makita");
				}
			}

			//
			if (properties.getProperty("CDD").contains("false")) {
				System.out.println("No va a generar despieces Dolmar");
			} else {
				if (properties.getProperty("CDDSN").contains("false")) {
					System.out.println("generar despieces Dolmar");
					botongenerarmaquinas(9);
				} else {
					System.out.println("generar solo cambios en despieces Dolmar");
				}
			}

			//

			//
			if (properties.getProperty("CMM").contains("false")) {
				System.out.println("No va a generar xml ni jpg de mauales Makita");
			} else {
				if (properties.getProperty("CMMSN").contains("false")) {
					System.out.println("generar mauales Makita");
					botongenerarmaquinas(10);
				} else {
					System.out.println("generar solo cambios en mauales Makita");
				}
			}

			//
			if (properties.getProperty("CMD").contains("false")) {
				System.out.println("No va a generar xml ni jpg de mauales Dolmar");
			} else {
				if (properties.getProperty("CMDSN").contains("false")) {
					System.out.println("generar mauales Dolmar");
					botongenerarmaquinas(11);
				} else {
					System.out.println("generar solo cambios en maunuales Dolmar");
				}
			}
		}
		//Grabarlista(listafinal);
		capturando = 0;
		capturaaccion = null;
		//listafinal = null;

	}

	@Override
	public void run() {
		int reftipo = (tipo);

		ArrayList<String> listadourls = listasurls.capturaurls(urls);

		String modelo = new String();
		int valuemodelo = 1000221 + tipo * reftipo;
		for (String urlscapturadas : listadourls) {
			// System.out.println(urlscapturadas);
			listafinal.add(reftipo + "@" + urlscapturadas);

			/*
			 * UrlscapturaJpaDAO emurls = new UrlscapturaJpaDAO();
			 * //System.out.println(urls); try {
			 * emurls.crear(modelo.valueOf(valuemodelo),urlscapturadas,reftipo,
			 * true,true);
			 * 
			 * } catch (SQLException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */
			valuemodelo = valuemodelo + reftipo + tipo;
		}

		System.out.println("FINALIZADA LA CAPTURA DE " + urls);
		System.out.println(listafinal.toString());
	}

	public void Grabarlista(ArrayList<String> listafinal) {
		int subtipo = 0;
		String suburl = "";
		for (String urlscapturadas : listafinal) {
			StringTokenizer substrings = new StringTokenizer(urlscapturadas, "@");
			while (substrings.hasMoreTokens()) {
				subtipo = Integer.valueOf(substrings.nextToken());
				suburl = substrings.nextToken();
			}

			UrlscapturaJpaDAO emurls = new UrlscapturaJpaDAO();
			System.out.println(suburl);
			int valuemodelo = 1000221 + tipo;
			String modelo = new String();

			try {
				emurls.crear(modelo.valueOf(valuemodelo), suburl, subtipo, false, true);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			valuemodelo = valuemodelo + tipo;
		}
	}

}

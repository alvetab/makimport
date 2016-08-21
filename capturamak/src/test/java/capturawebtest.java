package test.java;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.jsoup.nodes.Document;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import capturamak.capturaweb;

public class capturawebtest {
    int i;
    Document document;
    
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		capturaweb webacapturar = new capturaweb("makita");
		//webacapturar.url_web(urlmodelo)
		System.out.println(webacapturar.toString());
		assertThat(webacapturar.getDatosCapturados(),is(nullValue()));
		}
	
	@Test //web correcta no da fallo
	public void getcapturatest() {
	
		capturaweb webacapturar = new capturaweb("http://www.google.es");
		Document doc2= webacapturar.getDatosCapturados();
		System.out.println(doc2.toString());
		if (doc2.toString().indexOf("google")!=-1) {
			i =1;
			}
		
		assertEquals(1,i);
		}
	}



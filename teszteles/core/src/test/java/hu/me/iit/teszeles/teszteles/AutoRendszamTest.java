package hu.me.iit.teszeles.teszteles;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import hu.me.iit.teszeles.teszteles.exceptions.RendszamNemMegfeleleo;

@RunWith(Parameterized.class)
public class AutoRendszamTest {
	
	@Parameters
	public static Collection data() {
		List data = new ArrayList();
		data.add(new Object[]{"AAAA-123"});
		data.add(new Object[]{"AAAA123"});
		data.add(new Object[]{"aaa123"});
		data.add(new Object[]{"AAA-1234"});
		data.add(new Object[]{"AAAA-123"});
		data.add(new Object[]{"AAA-AAA"});
		data.add(new Object[]{"123-123"});
		return data;
	}
	String rendszam;
	
	public AutoRendszamTest(String rendszam) {
		this.rendszam=rendszam;
	}
	
	@Test(expected=RendszamNemMegfeleleo.class)
	public void testRosszRendszam() throws RendszamNemMegfeleleo {
		Auto auto = new Auto();
		System.out.println("A vizsgált rendszám: "+rendszam);
		auto.setRendszam(rendszam);
	}

}

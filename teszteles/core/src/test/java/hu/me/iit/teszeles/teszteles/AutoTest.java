package hu.me.iit.teszeles.teszteles;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import hu.me.iit.teszeles.teszteles.exceptions.AjtokSzamaNemMegfelelo;
import hu.me.iit.teszeles.teszteles.exceptions.GyartasiIdoNemMegfelelo;
import hu.me.iit.teszeles.teszteles.exceptions.RendszamNemMegfeleleo;

public class AutoTest {
	Auto testAuto;
	
	@Before
	public void initAuto() {
		testAuto = new Auto();
	}
	
	@Test
	public void testAjtokSzamaMegfelelo() throws AjtokSzamaNemMegfelelo {
		Auto auto = new Auto();
		auto.setAjtokSzama(3);
	}
	
	@Test(expected = AjtokSzamaNemMegfelelo.class)
	public void testAjtokSzamaTulAlacsony() throws AjtokSzamaNemMegfelelo {
		Auto auto = new Auto();
		auto.setAjtokSzama(-1);
	}
	
	@Test(expected = AjtokSzamaNemMegfelelo.class)
	public void testAjtokSzamaTulMagas() throws AjtokSzamaNemMegfelelo {
		Auto auto = new Auto();
		auto.setAjtokSzama(6);
	}
	
	@Test
	public void testJoRendszam()throws RendszamNemMegfeleleo{
		String rendszam = "ABC-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfeleleo.class)
	public void testKotojelNelkulRendszam() throws RendszamNemMegfeleleo{
		String rendszam = "ABC123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfeleleo.class)
	public void testTulHosszuBetusRendszam() throws RendszamNemMegfeleleo{
		String rendszam = "ABCA-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfeleleo.class)
	public void testTulHosszuSzamosRendszam() throws RendszamNemMegfeleleo{
		String rendszam = "ABC-1234";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfeleleo.class)
	public void testCsakSzamokRendszam() throws RendszamNemMegfeleleo{
		String rendszam = "123-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfeleleo.class)
	public void testCsakBetukRendszam() throws RendszamNemMegfeleleo{
		String rendszam = "ABC-ABC";
		testAuto.setRendszam(rendszam);
	}

	@Test(expected = RendszamNemMegfeleleo.class)
	public void testKisBetusRendszam() throws RendszamNemMegfeleleo{
		String rendszam = "aaa-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfeleleo.class)
	public void testQtTartalmazoRendszam() throws RendszamNemMegfeleleo{
		String rendszam = "ABQ-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test
	public void testJoGyartasiIdo() throws GyartasiIdoNemMegfelelo {
		String gyartasiIdo = "2021-04-07";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}
	
	@Test(expected = GyartasiIdoNemMegfelelo.class)
	public void testKoraiGyartasiIdo() throws GyartasiIdoNemMegfelelo {
		String gyartasiIdo = "0220-04-07";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}
	
	@Test(expected = GyartasiIdoNemMegfelelo.class)
	public void testKesoiGyartasiIdo() throws GyartasiIdoNemMegfelelo {
		String gyartasiIdo = "2022-04-07";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}
}

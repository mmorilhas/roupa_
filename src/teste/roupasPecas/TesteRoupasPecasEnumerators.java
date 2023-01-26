package teste.roupasPecas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.pBaixo.enumerators.BodyTipos;
import roupa.modelo.pBaixo.enumerators.CalcolaTipos;
import roupa.modelo.pBaixo.enumerators.Cintura;
import roupa.modelo.pBaixo.enumerators.ComprimentoDeCalca;
import roupa.modelo.pBaixo.enumerators.ComprimentoDeSaia;
import roupa.modelo.pBaixo.enumerators.GanchoTipos;
import roupa.modelo.pBaixo.enumerators.PunhoCalca;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Cava;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoBlusa;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoBustie;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoCasaco;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoPoncho;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Decote;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Lapela;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Manga;

public class TesteRoupasPecasEnumerators {
	
	
	@Test
	@DisplayName("Se BodyTipos metodos funcionam corretamente")
	void bodyTipos_pegaEnum(){
		
		
		assertTrue(BodyTipos.existeNoEnum("com_botão"));
	}
	
	@Test
	@DisplayName("Se BodyTipos metodos funcionam corretamente")
	void bodyTipos_existeEnum(){
		
		
		assertEquals(BodyTipos.pegaEnum("com_botão"), BodyTipos.COM_BOTAO);
	}
	
	@Test
	@DisplayName("Se calcolaTipos metodos funcionam corretamente")
	void calcolaTipos_pegaEnum(){
		
		
		assertTrue(CalcolaTipos.existeNoEnum("boxer"));
	}
	
	@Test
	@DisplayName("Se calcolaTipos metodos funcionam corretamente")
	void calcolaTipos_existeEnum(){
		
		
		assertEquals(CalcolaTipos.pegaEnum("boxer"), CalcolaTipos.BOXER);
	}

	@Test
	@DisplayName("Se cintura metodos funcionam corretamente")
	void cintura_pegaEnum(){
		
		
		assertTrue(Cintura.existeNoEnum("alta"));
	}
	
	@Test
	@DisplayName("Se cintura metodos funcionam corretamente")
	void cintura_existeEnum(){
		
		
		assertEquals(Cintura.pegaEnum("alta"), Cintura.ALTA);
	}
	

	@Test
	@DisplayName("Se comprimentoSaia metodos funcionam corretamente")
	void comprimentoSaia_pegaEnum(){
		
		
		assertTrue(ComprimentoDeSaia.existeNoEnum("no_joelho"));
	}
	
	@Test
	@DisplayName("Se comprimentoSaia metodos funcionam corretamente")
	void comprimentoSaia_existeEnum(){
		
		
		assertEquals(ComprimentoDeSaia.pegaEnum("no_joelho"), ComprimentoDeSaia.NO_JOELHO);
	}
	
	
	@Test
	@DisplayName("Se comprimentoCalca metodos funcionam corretamente")
	void comprimentoCalca_pegaEnum(){
		
		
		assertTrue(ComprimentoDeCalca.existeNoEnum("no_joelho"));
	}
	
	@Test
	@DisplayName("Se comprimentoCalca metodos funcionam corretamente")
	void comprimentoCalca_existeEnum(){
		
		
		assertEquals(ComprimentoDeCalca.pegaEnum("no_joelho"), ComprimentoDeCalca.NO_JOELHO);
	}
	
	
	@Test
	@DisplayName("Se comprimentoCalca metodos funcionam corretamente")
	void comprimentoCalca_pegaNumero(){
		
		
		assertEquals(ComprimentoDeCalca.pegaNumero("no_joelho"), 2);
	}
	
	
	@Test
	@DisplayName("Se punhoCalca metodos funcionam corretamente")
	void punhoCalca_pegaEnum(){
		
		
		assertTrue(PunhoCalca.existeNoEnum("com_fita"));
	}
	
	@Test
	@DisplayName("Se comprimentoCalca metodos funcionam corretamente")
	void punhoCalca_existeEnum(){
		
		
		assertEquals(PunhoCalca.pegaEnum("com_fita"), PunhoCalca.COM_FITA);
	}
	
	@Test
	@DisplayName("Se ganchoTipos metodos funcionam corretamente")
	void ganchoTipos_pegaEnum(){
		
		
		assertTrue(GanchoTipos.existeNoEnum("super_baixo"));
	}
	
	@Test
	@DisplayName("Se ganchoTipos metodos funcionam corretamente")
	void ganchoTipos_existeEnum(){
		
		
		assertEquals(GanchoTipos.pegaEnum("super_baixo"), GanchoTipos.SUPER_BAIXO);
	}
	
	
	@Test
	@DisplayName("Se manga metodos funcionam corretamente")
	void manga_pegaEnum(){
		assertTrue(Manga.existeNoEnum("Três_Quartos_Vazada"));
	}
	
	@Test
	@DisplayName("Se manga metodos funcionam corretamente")
	void manga_existeEnum(){
		assertEquals(Manga.pegaEnum("Três_Quartos_Vazada"), Manga.TRES_QUARTOS_VAZADO);
	}
	
	@Test
	@DisplayName("Se decote metodos funcionam corretamente")
	void decote_pegaEnum(){
		assertTrue(Decote.existeNoEnum("Colarinho_Inglês"));
	}
	
	@Test
	@DisplayName("Se decote metodos funcionam corretamente")
	void decote_existeEnum(){
		assertEquals(Decote.pegaEnum("Colarinho_Inglês"), Decote.COLARINHO_INGLES);
	}
	
	
	@Test
	@DisplayName("Se cava metodos funcionam corretamente")
	void cava_pegaEnum(){
		assertTrue(Cava.existeNoEnum("Sem"));
	}
	
	@Test
	@DisplayName("Se cava metodos funcionam corretamente")
	void cava_existeEnum(){
		assertEquals(Cava.pegaEnum("Sem"), Cava.SEM_CAVA);
	}
	
	@Test
	@DisplayName("Se lapela metodos funcionam corretamente")
	void lapela_pegaEnum(){
		assertTrue(Lapela.existeNoEnum("Lapela_Xale"));
	}
	
	@Test
	@DisplayName("Se lapela metodos funcionam corretamente")
	void lapela_existeEnum(){
		assertEquals(Lapela.pegaEnum("Lapela_Xale"), Lapela.LAPELA_XALE);
	}
	
	
	@Test
	@DisplayName("Se compBlusa metodos funcionam corretamente")
	void compBlusa_pegaEnum(){
		assertTrue(ComprimentoBlusa.existeNoEnum("Abaixo_do_Quadril"));
	}
	
	@Test
	@DisplayName("Se compBlusa metodos funcionam corretamente")
	void compBlusa_existeEnum(){
		assertEquals(ComprimentoBlusa.pegaEnum("Abaixo_do_Quadril"), ComprimentoBlusa.ABAIXO_DO_QUADRIL);
	}
	
	
	@Test
	@DisplayName("Se compBustie metodos funcionam corretamente")
	void compBustie_pegaEnum(){
		assertTrue(ComprimentoBustie.existeNoEnum("Abaixo_Do_Toráx"));
	}
	
	@Test
	@DisplayName("Se compBustie metodos funcionam corretamente")
	void compBustie_existeEnum(){
		assertEquals(ComprimentoBustie.pegaEnum("Abaixo_Do_Toráx"), ComprimentoBustie.ABAIXO_DO_TORAX);
	}
	
	@Test
	@DisplayName("Se compCasaco metodos funcionam corretamente")
	void compCasaco_pegaEnum(){
		assertTrue(ComprimentoCasaco.existeNoEnum("Meio_da_canela"));
	}
	
	@Test
	@DisplayName("Se compCasaco metodos funcionam corretamente")
	void compCasaco_existeEnum(){
		assertEquals(ComprimentoCasaco.pegaEnum("Meio_da_canela"), ComprimentoCasaco.MEIO_DA_CANELA);
	}
	
	
	@Test
	@DisplayName("Se compPoncho metodos funcionam corretamente")
	void compPoncho_pegaEnum(){
		assertTrue(ComprimentoPoncho.existeNoEnum("No_Joelho"));
	}
	
	@Test
	@DisplayName("Se compPoncho metodos funcionam corretamente")
	void compPoncho_existeEnum(){
		assertEquals(ComprimentoPoncho.pegaEnum("No_Joelho"), ComprimentoPoncho.NO_JOELHO);
	}
	
	

}

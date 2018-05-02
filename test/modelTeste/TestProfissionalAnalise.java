package modelTeste;



import junit.framework.TestCase;
import model.ProfissionalAnalise;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestProfissionalAnalise extends TestCase{
    
    public TestProfissionalAnalise() {
    }
    
    private ProfissionalAnalise profissionalAnalise;
    public void setUp() {
        profissionalAnalise = new ProfissionalAnalise();
    }
    
    
    
    public void  testAnalisaCalcioRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaCalcio(1001));
    }
    public void  testAnalisaCalcioRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaCalcio(601));
    }
    public void  testAnalisaCalcioRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaCalcio(501));
    }
    public void  testAnalisaCalcioRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaCalcio(401));
    }
    public void  testAnalisaCalcioRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaCalcio(301));
    }
    public void  testAnalisaCalcioRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaCalcio(201));
    }
    public void  testAnalisaCalcioRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaCalcio(151));
    }
    public void  testAnalisaCalcioRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaCalcio(101));
    }
    public void  testAnalisaCalcioRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaCalcio(51));
    }
    public void  testAnalisaCalcioRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaCalcio(11));
    }
    public void  testAnalisaCalcioRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaCalcio(10));
    }
    
    
    
    public void  testAnalisaCianetosRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaCianetos(1.01));
    }
    public void  testAnalisaCianetosRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaCianetos(0.61));
    }
    public void  testAnalisaCianetosRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaCianetos(0.51));
    }
    public void  testAnalisaCianetosRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaCianetos(0.41));
    }
    public void  testAnalisaCianetosRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaCianetos(0.31));
    }
    public void  testAnalisaCianetosRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaCianetos(0.21));
    }
    public void  testAnalisaCianetosRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaCianetos(0.11));
    }
    public void  testAnalisaCianetosRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaCianetos(0.06));
    }
    public void  testAnalisaCianetosRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaCianetos(0.03));
    }
    public void  testAnalisaCianetosRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaCianetos(0.01));
    }
    public void  testAnalisaCianetosRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaCianetos(0));
    }
    
    
    
    public void  testAnalisaCloretosRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaCloretos(1501));
    }
    public void  testAnalisaCloretosRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaCloretos(1001));
    }
    public void  testAnalisaCloretosRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaCloretos(701));
    }
    public void  testAnalisaCloretosRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaCloretos(501));
    }
    public void  testAnalisaCloretosRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaCloretos(301));
    }
    public void  testAnalisaCloretosRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaCloretos(201));
    }
    public void  testAnalisaCloretosRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaCloretos(151));
    }
    public void  testAnalisaCloretosRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaCloretos(101));
    }
    public void  testAnalisaCloretosRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaCloretos(51));
    }
    public void  testAnalisaCloretosRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaCloretos(1));
    }
    public void  testAnalisaCloretosRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaCloretos(0));
    }
    
    
    
    public void  testAnalisaCoLivreRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaCoLivre(61));
    }
    public void  testAnalisaCoLivreRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaCoLivre(51));
    }
    public void  testAnalisaCoLivreRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaCoLivre(41));
    }
    public void  testAnalisaCoLivreRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaCoLivre(31));
    }
    public void  testAnalisaCoLivreRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaCoLivre(21));
    }
    public void  testAnalisaCoLivreRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaCoLivre(11));
    }
    public void  testAnalisaCoLivreRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaCoLivre(10));
    }
    public void  testAnalisaCoLivreRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaCoLivre(9));
    }
    public void  testAnalisaCoLivreRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaCoLivre(8));
    }
    public void  testAnalisaCoLivreRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaCoLivre(4));
    }
    public void  testAnalisaCoLivreRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaCoLivre(3));
    }
    
    
    
    public void  testAnalisaColiformesTotaisRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaColiformesTotais(14001));
    }
    public void  testAnalisaColiformesTotaisRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaColiformesTotais(10001));
    }
    public void  testAnalisaColiformesTotaisRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaColiformesTotais(7001));
    }
    public void  testAnalisaColiformesTotaisRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaColiformesTotais(5001));
    }
    public void  testAnalisaColiformesTotaisRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaColiformesTotais(4001));
    }
    public void  testAnalisaColiformesTotaisRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaColiformesTotais(3001));
    }
    public void  testAnalisaColiformesTotaisRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaColiformesTotais(2001));
    }
    public void  testAnalisaColiformesTotaisRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaColiformesTotais(1501));
    }
    public void  testAnalisaColiformesTotaisRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaColiformesTotais(1001));
    }
    public void  testAnalisaColiformesTotaisRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaColiformesTotais(51));
    }
    public void  testAnalisaColiformesTotaisRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaColiformesTotais(50));
    }
    
    
    
    public void  testAnalisaCondutividadeRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaCondutividade(16001));
    }
    public void  testAnalisaCondutividadeRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaCondutividade(12001));
    }
    public void  testAnalisaCondutividadeRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaCondutividade(8001));
    }
    public void  testAnalisaCondutividadeRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaCondutividade(5001));
    }
    public void  testAnalisaCondutividadeRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaCondutividade(3001));
    }
    public void  testAnalisaCondutividadeRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaCondutividade(2501));
    }
    public void  testAnalisaCondutividadeRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaCondutividade(2001));
    }
    public void  testAnalisaCondutividadeRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaCondutividade(1501));
    }
    public void  testAnalisaCondutividadeRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaCondutividade(1251));
    }
    public void  testAnalisaCondutividadeRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaCondutividade(750));
    }
    public void  testAnalisaCondutividadeRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaCondutividade(749));
    }
    
}

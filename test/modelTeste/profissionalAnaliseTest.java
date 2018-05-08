package modelTeste;



import junit.framework.TestCase;
import model.ProfissionalAnalise;

public class profissionalAnaliseTest extends TestCase{
    
    public profissionalAnaliseTest() {
    }
    
    private ProfissionalAnalise profissionalAnalise;
    public void setUp() {
        profissionalAnalise = new ProfissionalAnalise();
    }
    
    
    public void  testAnalisaPhRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaPh(1));
    }
    public void  testAnalisaPhRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaPh(2));
    }
    public void  testAnalisaPhRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaPh(3));
    }
    public void  testAnalisaPhRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaPh(4));
    }
    public void  testAnalisaPhRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaPh(5));
    }
    public void  testAnalisaPhRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaPh(6));
    }
    public void  testAnalisaPhRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaPh(7));
    }
    public void  testAnalisaPhRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaPh(8));
    }
    public void  testAnalisaPhRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaPh(9));
    }
    public void  testAnalisaPhRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaPh(10));
    }
    public void  testAnalisaPhRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaPh(10.1));
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
    
    
    public void  testAnalisaOxigenioDissolvidoRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaOxigenioDissolvido(0.9));
    }
    public void  testAnalisaOxigenioDissolvidoRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaOxigenioDissolvido(1.9));
    }
    public void  testAnalisaOxigenioDissolvidoRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaOxigenioDissolvido(2.9));
    }
    public void  testAnalisaOxigenioDissolvidoRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaOxigenioDissolvido(3.4));
    }
    public void  testAnalisaOxigenioDissolvidoRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaOxigenioDissolvido(3.9));
    }
    public void  testAnalisaOxigenioDissolvidoRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaOxigenioDissolvido(4.9));
    }
    public void  testAnalisaOxigenioDissolvidoRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaOxigenioDissolvido(5.9));
    }
    public void  testAnalisaOxigenioDissolvidoRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaOxigenioDissolvido(6.4));
    }
    public void  testAnalisaOxigenioDissolvidoRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaOxigenioDissolvido(6.9));
    }
    public void  testAnalisaOxigenioDissolvidoRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaOxigenioDissolvido(7.4));
    }
    public void  testAnalisaOxigenioDissolvidoRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaOxigenioDissolvido(7.5));
    }
    
    
    public void  testAnalisaReducaoPermanganatoRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaReducaoPermanganato(16));
    }
    public void  testAnalisaReducaoPermanganatoRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaReducaoPermanganato(13));
    }
    public void  testAnalisaReducaoPermanganatoRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaReducaoPermanganato(11));
    }
    public void  testAnalisaReducaoPermanganatoRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaReducaoPermanganato(9));
    }
    public void  testAnalisaReducaoPermanganatoRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaReducaoPermanganato(7));
    }
    public void  testAnalisaReducaoPermanganatoRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaReducaoPermanganato(6));
    }
    public void  testAnalisaReducaoPermanganatoRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaReducaoPermanganato(5));
    }
    public void  testAnalisaReducaoPermanganatoRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaReducaoPermanganato(4));
    }
    public void  testAnalisaReducaoPermanganatoRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaReducaoPermanganato(3));
    }
    public void  testAnalisaReducaoPermanganatoRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaReducaoPermanganato(0.6));
    }
    public void  testAnalisaReducaoPermanganatoRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaReducaoPermanganato(0.5));
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
    
    
    public void  testAnalisaNitrogenioAmoniacalRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaNitrogenioAmoniacal(1.26));
    }
    public void  testAnalisaNitrogenioAmoniacalRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaNitrogenioAmoniacal(1.01));
    }
    public void  testAnalisaNitrogenioAmoniacalRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaNitrogenioAmoniacal(0.76));
    }
    public void  testAnalisaNitrogenioAmoniacalRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaNitrogenioAmoniacal(0.51));
    }
    public void  testAnalisaNitrogenioAmoniacalRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaNitrogenioAmoniacal(0.41));
    }
    public void  testAnalisaNitrogenioAmoniacalRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaNitrogenioAmoniacal(0.31));
    }
    public void  testAnalisaNitrogenioAmoniacalRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaNitrogenioAmoniacal(0.21));
    }
    public void  testAnalisaNitrogenioAmoniacalRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaNitrogenioAmoniacal(0.11));
    }
    public void  testAnalisaNitrogenioAmoniacalRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaNitrogenioAmoniacal(0.06));
    }
    public void  testAnalisaNitrogenioAmoniacalRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaNitrogenioAmoniacal(0.01));
    }
    public void  testAnalisaNitrogenioAmoniacalRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaNitrogenioAmoniacal(0));
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
    
    
    public void  testAnalisaDetergentesRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaDetergentes(3.1));
    }
    public void  testAnalisaDetergentesRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaDetergentes(2.1));
    }
    public void  testAnalisaDetergentesRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaDetergentes(1.6));
    }
    public void  testAnalisaDetergentesRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaDetergentes(1.1));
    }
    public void  testAnalisaDetergentesRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaDetergentes(0.76));
    }
    public void  testAnalisaDetergentesRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaDetergentes(0.51));
    }
    public void  testAnalisaDetergentesRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaDetergentes(0.26));
    }
    public void  testAnalisaDetergentesRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaDetergentes(0.11));
    }
    public void  testAnalisaDetergentesRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaDetergentes(0.07));
    }
    public void  testAnalisaDetergentesRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaDetergentes(0.01));
    }
    public void  testAnalisaDetergentesRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaDetergentes(0));
    }
    
    
    public void  testAnalisaDurezaAlcalinidadeRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaDurezaAlcalinidade(1501));
    }
    public void  testAnalisaDurezaAlcalinidadeRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaDurezaAlcalinidade(1001));
    }
    public void  testAnalisaDurezaAlcalinidadeRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaDurezaAlcalinidade(801));
    }
    public void  testAnalisaDurezaAlcalinidadeRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaDurezaAlcalinidade(601));
    }
    public void  testAnalisaDurezaAlcalinidadeRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaDurezaAlcalinidade(501));
    }
    public void  testAnalisaDurezaAlcalinidadeRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaDurezaAlcalinidade(401));
    }
    public void  testAnalisaDurezaAlcalinidadeRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaDurezaAlcalinidade(301));
    }
    public void  testAnalisaDurezaAlcalinidadeRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaDurezaAlcalinidade(201));
    }
    public void  testAnalisaDurezaAlcalinidadeRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaDurezaAlcalinidade(101));
    }
    public void  testAnalisaDurezaAlcalinidadeRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaDurezaAlcalinidade(26));
    }
    public void  testAnalisaDurezaAlcalinidadeRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaDurezaAlcalinidade(25));
    }
    
    
    public void  testAnalisaSolidosDissolvidosRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaSolidosDissolvidos(20001));
    }
    public void  testAnalisaSolidosDissolvidosRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaSolidosDissolvidos(10001));
    }
    public void  testAnalisaSolidosDissolvidosRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaSolidosDissolvidos(5001));
    }
    public void  testAnalisaSolidosDissolvidosRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaSolidosDissolvidos(3001));
    }
    public void  testAnalisaSolidosDissolvidosRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaSolidosDissolvidos(2001));
    }
    public void  testAnalisaSolidosDissolvidosRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaSolidosDissolvidos(1501));
    }
    public void  testAnalisaSolidosDissolvidosRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaSolidosDissolvidos(1001));
    }
    public void  testAnalisaSolidosDissolvidosRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaSolidosDissolvidos(751));
    }
    public void  testAnalisaSolidosDissolvidosRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaSolidosDissolvidos(501));
    }
    public void  testAnalisaSolidosDissolvidosRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaSolidosDissolvidos(101));
    }
    public void  testAnalisaSolidosDissolvidosRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaSolidosDissolvidos(100));
    }
    
    
    public void  testAnalisaPraguicidasRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaPraguicidas(2.01));
    }
    public void  testAnalisaPraguicidasRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaPraguicidas(1.01));
    }
    public void  testAnalisaPraguicidasRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaPraguicidas(0.41));
    }
    public void  testAnalisaPraguicidasRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaPraguicidas(0.21));
    }
    public void  testAnalisaPraguicidasRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaPraguicidas(0.11));
    }
    public void  testAnalisaPraguicidasRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaPraguicidas(0.06));
    }
    public void  testAnalisaPraguicidasRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaPraguicidas(0.026));
    }
    public void  testAnalisaPraguicidasRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaPraguicidas(0.011));
    }
    public void  testAnalisaPraguicidasRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaPraguicidas(0.006));
    }
    public void  testAnalisaPraguicidasRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaPraguicidas(0.001));
    }
    public void  testAnalisaPraguicidasRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaPraguicidas(0));
    }
    
    
    public void  testAnalisaGraxasAzeitesRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaGraxasAzeites(3.1));
    }
    public void  testAnalisaGraxasAzeitesRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaGraxasAzeites(2.1));
    }
    public void  testAnalisaGraxasAzeitesRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaGraxasAzeites(1.1));
    }
    public void  testAnalisaGraxasAzeitesRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaGraxasAzeites(0.7));
    }
    public void  testAnalisaGraxasAzeitesRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaGraxasAzeites(0.4));
    }
    public void  testAnalisaGraxasAzeitesRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaGraxasAzeites(0.16));
    }
    public void  testAnalisaGraxasAzeitesRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaGraxasAzeites(0.09));
    }
    public void  testAnalisaGraxasAzeitesRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaGraxasAzeites(0.05));
    }
    public void  testAnalisaGraxasAzeitesRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaGraxasAzeites(0.03));
    }
    public void  testAnalisaGraxasAzeitesRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaGraxasAzeites(0.01));
    }
    public void  testAnalisaGraxasAzeitesRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaGraxasAzeites(0));
    }
    
    
    public void  testAnalisaSulfatosRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaSulfatos(1501));
    }
    public void  testAnalisaSulfatosRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaSulfatos(1001));
    }
    public void  testAnalisaSulfatosRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaSulfatos(601));
    }
    public void  testAnalisaSulfatosRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaSulfatos(401));
    }
    public void  testAnalisaSulfatosRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaSulfatos(251));
    }
    public void  testAnalisaSulfatosRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaSulfatos(151));
    }
    public void  testAnalisaSulfatosRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaSulfatos(101));
    }
    public void  testAnalisaSulfatosRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaSulfatos(76));
    }
    public void  testAnalisaSulfatosRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaSulfatos(51));
    }
    public void  testAnalisaSulfatosRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaSulfatos(1));
    }
    public void  testAnalisaSulfatosRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaSulfatos(0));
    }
    
    
    public void  testAnalisaNitratosRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaNitratos(101));
    }
    public void  testAnalisaNitratosRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaNitratos(51));
    }
    public void  testAnalisaNitratosRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaNitratos(21));
    }
    public void  testAnalisaNitratosRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaNitratos(16));
    }
    public void  testAnalisaNitratosRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaNitratos(11));
    }
    public void  testAnalisaNitratosRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaNitratos(9));
    }
    public void  testAnalisaNitratosRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaNitratos(7));
    }
    public void  testAnalisaNitratosRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaNitratos(5));
    }
    public void  testAnalisaNitratosRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaNitratos(3));
    }
    public void  testAnalisaNitratosRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaNitratos(1));
    }
    public void  testAnalisaNitratosRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaNitratos(0));
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
    
    
    public void  testAnalisaMagnesioRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaMagnesio(501));
    }
    public void  testAnalisaMagnesioRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaMagnesio(301));
    }
    public void  testAnalisaMagnesioRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaMagnesio(251));
    }
    public void  testAnalisaMagnesioRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaMagnesio(201));
    }
    public void  testAnalisaMagnesioRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaMagnesio(151));
    }
    public void  testAnalisaMagnesioRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaMagnesio(101));
    }
    public void  testAnalisaMagnesioRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaMagnesio(76));
    }
    public void  testAnalisaMagnesioRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaMagnesio(51));
    }
    public void  testAnalisaMagnesioRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaMagnesio(26));
    }
    public void  testAnalisaMagnesioRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaMagnesio(11));
    }
    public void  testAnalisaMagnesioRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaMagnesio(10));
    }
    
    
    public void  testAnalisaFosfatosRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaFosfatos(501));
    }
    public void  testAnalisaFosfatosRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaFosfatos(301));
    }
    public void  testAnalisaFosfatosRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaFosfatos(201));
    }
    public void  testAnalisaFosfatosRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaFosfatos(101));
    }
    public void  testAnalisaFosfatosRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaFosfatos(51));
    }
    public void  testAnalisaFosfatosRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaFosfatos(31));
    }
    public void  testAnalisaFosfatosRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaFosfatos(21));
    }
    public void  testAnalisaFosfatosRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaFosfatos(11));
    }
    public void  testAnalisaFosfatosRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaFosfatos(6));
    }
    public void  testAnalisaFosfatosRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaFosfatos(1));
    }
    public void  testAnalisaFosfatosRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaFosfatos(0));
    }
    
    
    public void  testAnalisaNitritosRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaNitritos(1.01));
    }
    public void  testAnalisaNitritosRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaNitritos(0.51));
    }
    public void  testAnalisaNitritosRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaNitritos(0.26));
    }
    public void  testAnalisaNitritosRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaNitritos(0.21));
    }
    public void  testAnalisaNitritosRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaNitritos(0.16));
    }
    public void  testAnalisaNitritosRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaNitritos(0.11));
    }
    public void  testAnalisaNitritosRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaNitritos(0.06));
    }
    public void  testAnalisaNitritosRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaNitritos(0.026));
    }
    public void  testAnalisaNitritosRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaNitritos(0.011));
    }
    public void  testAnalisaNitritosRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaNitritos(0.001));
    }
    public void  testAnalisaNitritosRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaNitritos(0));
    }
    
    
    public void  testAnalisaDboRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaDbo(16));
    }
    public void  testAnalisaDboRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaDbo(13));
    }
    public void  testAnalisaDboRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaDbo(11));
    }
    public void  testAnalisaDboRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaDbo(9));
    }
    public void  testAnalisaDboRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaDbo(7));
    }
    public void  testAnalisaDboRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaDbo(6));
    }
    public void  testAnalisaDboRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaDbo(5));
    }
    public void  testAnalisaDboRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaDbo(3));
    }
    public void  testAnalisaDboRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaDbo(2));
    }
    public void  testAnalisaDboRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaDbo(0.6));
    }
    public void  testAnalisaDboRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaDbo(0.5));
    }
    
    
    public void  testAnalisaCorRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaCor(251));
    }
    public void  testAnalisaCorRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaCor(101));
    }
    public void  testAnalisaCorRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaCor(61));
    }
    public void  testAnalisaCorRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaCor(41));
    }
    public void  testAnalisaCorRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaCor(31));
    }
    public void  testAnalisaCorRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaCor(21));
    }
    public void  testAnalisaCorRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaCor(16));
    }
    public void  testAnalisaCorRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaCor(11));
    }
    public void  testAnalisaCorRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaCor(6));
    }
    public void  testAnalisaCorRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaCor(4));
    }
    public void  testAnalisaCorRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaCor(3));
    }
    
    
    public void  testAnalisaTurbidezRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaTurbidez(401));
    }
    public void  testAnalisaTurbidezRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaTurbidez(251));
    }
    public void  testAnalisaTurbidezRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaTurbidez(181));
    }
    public void  testAnalisaTurbidezRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaTurbidez(101));
    }
    public void  testAnalisaTurbidezRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaTurbidez(51));
    }
    public void  testAnalisaTurbidezRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaTurbidez(21));
    }
    public void  testAnalisaTurbidezRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaTurbidez(16));
    }
    public void  testAnalisaTurbidezRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaTurbidez(11));
    }
    public void  testAnalisaTurbidezRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaTurbidez(6));
    }
    public void  testAnalisaTurbidezRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaTurbidez(4));
    }
    public void  testAnalisaTurbidezRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaTurbidez(3));
    }
    
    
    public void  testAnalisaSodioRetorna1(){
        assertEquals(new Integer("1"), profissionalAnalise.analisaSodio(501));
    }
    public void  testAnalisaSodioRetorna2(){
        assertEquals(new Integer("2"), profissionalAnalise.analisaSodio(301));
    }
    public void  testAnalisaSodioRetorna3(){
        assertEquals(new Integer("3"), profissionalAnalise.analisaSodio(251));
    }
    public void  testAnalisaSodioRetorna4(){
        assertEquals(new Integer("4"), profissionalAnalise.analisaSodio(201));
    }
    public void  testAnalisaSodioRetorna5(){
        assertEquals(new Integer("5"), profissionalAnalise.analisaSodio(151));
    }
    public void  testAnalisaSodioRetorna6(){
        assertEquals(new Integer("6"), profissionalAnalise.analisaSodio(101));
    }
    public void  testAnalisaSodioRetorna7(){
        assertEquals(new Integer("7"), profissionalAnalise.analisaSodio(76));
    }
    public void  testAnalisaSodioRetorna8(){
        assertEquals(new Integer("8"), profissionalAnalise.analisaSodio(51));
    }
    public void  testAnalisaSodioRetorna9(){
        assertEquals(new Integer("9"), profissionalAnalise.analisaSodio(26));
    }
    public void  testAnalisaSodioRetorna10(){
        assertEquals(new Integer("10"), profissionalAnalise.analisaSodio(11));
    }
    public void  testAnalisaSodioRetorna11(){
        assertEquals(new Integer("11"), profissionalAnalise.analisaSodio(10));
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
    
    
    
    
}

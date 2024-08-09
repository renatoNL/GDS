package start.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_previdencia")
public class PrevidenciaModel {

    // como o usuario teoricamente ja estará em um login nao será necessario criar um id --> acho //
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private int idadeInicial;
    private int idadeAposentadoria;
    private double valorInvestir;
    // assim como nao tenho certeza se isso daqui é necessario ja que da para se fazer com o front //
    
    public PrevidenciaModel() {
    }

    public PrevidenciaModel(int idadeInicial, int idadeAposentadoria, double valorInvestir) {
        this.idadeInicial = idadeInicial;
        this.idadeAposentadoria = idadeAposentadoria;
        
        this.valorInvestir = valorInvestir;
    }

    public int getIdadeInicial() {
        return idadeInicial;
    }

    public void setIdadeInicial(int idadeInicial) {
        this.idadeInicial = idadeInicial;
    }

    public int getIdadeAposentadoria() {
        return idadeAposentadoria;
    }

    public void setIdadeAposentadoria(int idadeAposentadoria) {
        this.idadeAposentadoria = idadeAposentadoria;
    }

    public double getValorInvestir() {
        return valorInvestir;
    }

    public void setValorInvestir(double valorInvestir) {
        this.valorInvestir = valorInvestir;
    }

}

package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        //Impressora impressora = em;
        //Digitalizadora digitalizadora = em;
        //Copiadora copiadora = em;

        Deskjet deskjet = new Deskjet();

        Impressora impressora = deskjet;
        //Digitalizadora digitalizadora = deskjet;

        impressora.Imprimindo();
        //digitalizadora.digitalizar();;
        //copiadora.copiar();


    }
}

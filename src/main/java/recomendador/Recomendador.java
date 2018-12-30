package recomendador;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;

/**
 * @author jribeiro
 * @date 30/12/18
 */
public class Recomendador {
    public DataModel getDataModel(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);
        return new FileDataModel(file);
    }
}

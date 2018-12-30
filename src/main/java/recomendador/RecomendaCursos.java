package recomendador;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

/**
 * @author jribeiro
 * @date 30/12/18
 */
public class RecomendaCursos {
    public static void main(String[] args) throws IOException, TasteException {
        DataModel model = new Recomendador().getDataModel("cursos.csv");
        RecomendadorDeProdutosBuilder recomendadorDeProdutosBuilder= new RecomendadorDeProdutosBuilder();
        Recommender recommender = recomendadorDeProdutosBuilder.buildRecommender(model);
        List<RecommendedItem> recomendations = recommender.recommend(15,6);
        for (RecommendedItem recommendedItem:recomendations){
            System.out.println(recommendedItem);
        }
    }
}

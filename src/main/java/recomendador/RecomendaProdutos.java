package recomendador;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

/**
 * @author jhonatar on 21/12/2018
 */
public class RecomendaProdutos {
    public static void main(String args[]) throws IOException, TasteException {

        DataModel model = new Recomendador().getDataModel("dados.csv");

        RecomendadorDeProdutosBuilder recomendadorDeProdutosBuilder = new RecomendadorDeProdutosBuilder();
        Recommender recommender = recomendadorDeProdutosBuilder.buildRecommender(model);
        List<RecommendedItem> recommendations = recommender.recommend(3,3);

        for (RecommendedItem recommendation:recommendations) {
            System.out.println(recommendation);
        }
    }
}

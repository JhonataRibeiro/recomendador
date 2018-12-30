package recomendador;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

import java.io.IOException;

/**
 * @author jribeiro
 * @date 27/12/18
 */
public class Avaliador {
    public static void main(String[] args) throws IOException, TasteException {

        RandomUtils.useTestSeed();

        DataModel model = new Recomendador().getDataModel("cursos.csv");

        RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
        RecommenderBuilder builder = new RecomendadorDeProdutosBuilder();
        double error = evaluator.evaluate(builder,  null, model,0.9,1.0 );
        System.out.println(error);
    }
}

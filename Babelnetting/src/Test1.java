import java.util.List;

import it.uniroma1.lcl.babelnet.BabelNet;
import it.uniroma1.lcl.babelnet.BabelSynset;
import it.uniroma1.lcl.jlt.util.Language;

/**
 * 
 */

/**
 * @author Saimir Bala
 *
 */
public class Test1 {
	public static void main(String[] args) {
	   BabelNet bn = BabelNet.getInstance();
	   List<BabelSynset> sysets = bn.getSynsets(Language.EN, "process");
	   
	   for (BabelSynset babelSynset : sysets) {
	   	System.out.println(babelSynset);
      }
	   
   }
}

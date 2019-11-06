import java.awt.Dimension;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;

public class Main
{
  public static void main(String[] args) throws ParseException, UnsupportedLookAndFeelException
  {

        setUpLookAndFeel();

//    LookAndFeelHandler.getInstance().setupSyntheticaLF();

    final JFrame testFrame = new JFrame("Gayan Perera, (Gayan), Central administrator*The Orthopedic department*");

    testFrame.setSize(new Dimension(600, 400));
    testFrame.setVisible(true);

  }

  private static void setUpLookAndFeel() throws UnsupportedLookAndFeelException, ParseException
  {
    UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel()
      {
        @Override
        protected void loadCustomXML() throws ParseException
        {
          loadXMLConfig("/CustomLF.xml");
        }
      });
  }

}

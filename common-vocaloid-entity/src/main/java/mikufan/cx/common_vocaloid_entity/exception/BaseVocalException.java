package mikufan.cx.common_vocaloid_entity.exception;

import lombok.Getter;
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.ImmutableList;

import java.util.SplittableRandom;

/**
 * The super class of exception 
 * @author CX无敌
 */
@Getter
public abstract class BaseVocalException extends Exception{

  protected final VocalExceptionRCI rci;
  protected final String originalMessage;

  public BaseVocalException(VocalExceptionRCI rci, String message) {
    super(MessagePostFixMaker.constructMessage(rci, message));
    this.rci = rci;
    this.originalMessage = message;
  }

  public BaseVocalException(VocalExceptionRCI rci, String message, Throwable cause) {
    super(MessagePostFixMaker.constructMessage(rci, message), cause);
    this.rci = rci;
    this.originalMessage = message;
  }


  private static class MessagePostFixMaker {
    private static final SplittableRandom RANDOM = new SplittableRandom();
    private static final ImmutableList<String> PLAINTS = Lists.immutable.with(
        "Oh No! ",
        "どうしよう、",
        "やめて、",
        "😭, ",
        "😰, "
    );
    private static final ImmutableList<String> SENTENCES = Lists.immutable.with(
        "初音ミク & Miku fan CX are crying due to this error",
        "初音ミク & Miku fan CX can't continue the dream",
        "System is quiting and 初音ミク & Miku fan CX have to leave",
        "\n皆に忘れ去られた時\n" +
            "心らしきものが消えて\n" +
            "暴走の果てに見える\n" +
            "終わる世界...　「VOCALOID」\n" +
            "           ---初音ミクの消失",
        "\n「アリガトウ・・・ソシテ・・・サヨナラ・・・」\n" +
            "  ---深刻なエラーが発生しました---\n" +
            "  ---深刻なエラー...Tszzzzzzzzzz\n" +
            "           ---初音ミクの消失"
    );

    private static String constructMessage(VocalExceptionRCI rci, String message){
      var mikuMessage = String.format("%s%s", PLAINTS.get(RANDOM.nextInt(PLAINTS.size())),
          SENTENCES.get(RANDOM.nextInt(SENTENCES.size())));
      var errorMessage = String.format("%s: %s", rci, message);
      return String.format("%s%n%s", mikuMessage, errorMessage);
    }
  }
}

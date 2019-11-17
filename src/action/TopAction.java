package action;

import com.opensymphony.xwork2.Action;

import lombok.Getter;
import lombok.Setter;

/**
 * 本アプリケーションにアクセスする
 *
 * @author jumborin
 *
 */
public class TopAction implements Action {
    @Getter @Setter
    private String userId ="";
    @Getter @Setter
    private String password ="";

    @Override
    public String execute() throws Exception {
	return "ok";
    }
}

/**
 * 
 */
package controller.mq;

import java.io.Serializable;

/**
 * @author Admin
 *
 */
public class User implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6079515920284649113L;

	private String name;
	
	private String pass;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}

package accountchecker;

/**
 *
 */
public class Account
{
	/** the account username */
	private String username;
	/** the account password */
	private String password;

	/**
	 * the empty account constructor
	 */
	public Account()
	{
	}

	/**
	 * the account constructor
	 * 
	 * @param username
	 * @param password
	 */
	public Account(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}
}

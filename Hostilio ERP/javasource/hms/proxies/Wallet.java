// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package hms.proxies;

public class Wallet
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject walletMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HMS.Wallet";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Money("Money"),
		Tenant_Wallet("HMS.Tenant_Wallet");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Wallet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Wallet(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject walletMendixObject)
	{
		if (walletMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, walletMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.walletMendixObject = walletMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Wallet.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static hms.proxies.Wallet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return hms.proxies.Wallet.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static hms.proxies.Wallet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new hms.proxies.Wallet(context, mendixObject);
	}

	public static hms.proxies.Wallet load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return hms.proxies.Wallet.initialize(context, mendixObject);
	}

	public static java.util.List<hms.proxies.Wallet> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> hms.proxies.Wallet.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Money
	 */
	public final java.lang.Integer getMoney()
	{
		return getMoney(getContext());
	}

	/**
	 * @param context
	 * @return value of Money
	 */
	public final java.lang.Integer getMoney(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Money.toString());
	}

	/**
	 * Set value of Money
	 * @param money
	 */
	public final void setMoney(java.lang.Integer money)
	{
		setMoney(getContext(), money);
	}

	/**
	 * Set value of Money
	 * @param context
	 * @param money
	 */
	public final void setMoney(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer money)
	{
		getMendixObject().setValue(context, MemberNames.Money.toString(), money);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Tenant_Wallet
	 */
	public final hms.proxies.Tenant getTenant_Wallet() throws com.mendix.core.CoreException
	{
		return getTenant_Wallet(getContext());
	}

	/**
	 * @param context
	 * @return value of Tenant_Wallet
	 * @throws com.mendix.core.CoreException
	 */
	public final hms.proxies.Tenant getTenant_Wallet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		hms.proxies.Tenant result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tenant_Wallet.toString());
		if (identifier != null) {
			result = hms.proxies.Tenant.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Tenant_Wallet
	 * @param tenant_wallet
	 */
	public final void setTenant_Wallet(hms.proxies.Tenant tenant_wallet)
	{
		setTenant_Wallet(getContext(), tenant_wallet);
	}

	/**
	 * Set value of Tenant_Wallet
	 * @param context
	 * @param tenant_wallet
	 */
	public final void setTenant_Wallet(com.mendix.systemwideinterfaces.core.IContext context, hms.proxies.Tenant tenant_wallet)
	{
		if (tenant_wallet == null) {
			getMendixObject().setValue(context, MemberNames.Tenant_Wallet.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Tenant_Wallet.toString(), tenant_wallet.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return walletMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final hms.proxies.Wallet that = (hms.proxies.Wallet) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

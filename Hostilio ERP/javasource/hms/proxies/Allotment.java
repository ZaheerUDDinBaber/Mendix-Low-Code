// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package hms.proxies;

public class Allotment
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject allotmentMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HMS.Allotment";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AllotmentDate("AllotmentDate"),
		Tenant_Allotment("HMS.Tenant_Allotment"),
		Hostel_Allotment("HMS.Hostel_Allotment"),
		Bed_Allotment("HMS.Bed_Allotment");

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

	public Allotment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Allotment(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject allotmentMendixObject)
	{
		if (allotmentMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, allotmentMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.allotmentMendixObject = allotmentMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Allotment.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static hms.proxies.Allotment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return hms.proxies.Allotment.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static hms.proxies.Allotment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new hms.proxies.Allotment(context, mendixObject);
	}

	public static hms.proxies.Allotment load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return hms.proxies.Allotment.initialize(context, mendixObject);
	}

	public static java.util.List<hms.proxies.Allotment> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> hms.proxies.Allotment.initialize(context, obj))
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
	 * @return value of AllotmentDate
	 */
	public final java.util.Date getAllotmentDate()
	{
		return getAllotmentDate(getContext());
	}

	/**
	 * @param context
	 * @return value of AllotmentDate
	 */
	public final java.util.Date getAllotmentDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.AllotmentDate.toString());
	}

	/**
	 * Set value of AllotmentDate
	 * @param allotmentdate
	 */
	public final void setAllotmentDate(java.util.Date allotmentdate)
	{
		setAllotmentDate(getContext(), allotmentdate);
	}

	/**
	 * Set value of AllotmentDate
	 * @param context
	 * @param allotmentdate
	 */
	public final void setAllotmentDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date allotmentdate)
	{
		getMendixObject().setValue(context, MemberNames.AllotmentDate.toString(), allotmentdate);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Tenant_Allotment
	 */
	public final hms.proxies.Tenant getTenant_Allotment() throws com.mendix.core.CoreException
	{
		return getTenant_Allotment(getContext());
	}

	/**
	 * @param context
	 * @return value of Tenant_Allotment
	 * @throws com.mendix.core.CoreException
	 */
	public final hms.proxies.Tenant getTenant_Allotment(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		hms.proxies.Tenant result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tenant_Allotment.toString());
		if (identifier != null) {
			result = hms.proxies.Tenant.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Tenant_Allotment
	 * @param tenant_allotment
	 */
	public final void setTenant_Allotment(hms.proxies.Tenant tenant_allotment)
	{
		setTenant_Allotment(getContext(), tenant_allotment);
	}

	/**
	 * Set value of Tenant_Allotment
	 * @param context
	 * @param tenant_allotment
	 */
	public final void setTenant_Allotment(com.mendix.systemwideinterfaces.core.IContext context, hms.proxies.Tenant tenant_allotment)
	{
		if (tenant_allotment == null) {
			getMendixObject().setValue(context, MemberNames.Tenant_Allotment.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Tenant_Allotment.toString(), tenant_allotment.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Hostel_Allotment
	 */
	public final java.util.List<hms.proxies.Hostel> getHostel_Allotment() throws com.mendix.core.CoreException
	{
		return getHostel_Allotment(getContext());
	}

	/**
	 * @param context
	 * @return value of Hostel_Allotment
	 * @throws com.mendix.core.CoreException
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<hms.proxies.Hostel> getHostel_Allotment(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<hms.proxies.Hostel> result = new java.util.ArrayList<>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Hostel_Allotment.toString());
		if (valueObject == null) {
			return result;
		}
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject)) {
			result.add(hms.proxies.Hostel.initialize(context, mendixObject));
		}
		return result;
	}

	/**
	 * Set value of Hostel_Allotment
	 * @param hostel_allotment
	 */
	public final void setHostel_Allotment(java.util.List<hms.proxies.Hostel> hostel_allotment)
	{
		setHostel_Allotment(getContext(), hostel_allotment);
	}

	/**
	 * Set value of Hostel_Allotment
	 * @param context
	 * @param hostel_allotment
	 */
	public final void setHostel_Allotment(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<hms.proxies.Hostel> hostel_allotment)
	{
		var identifiers = hostel_allotment
			.stream()
			.map(proxyObject -> proxyObject.getMendixObject().getId())
			.collect(java.util.stream.Collectors.toList());
		
		getMendixObject().setValue(context, MemberNames.Hostel_Allotment.toString(), identifiers);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Bed_Allotment
	 */
	public final hms.proxies.Bed getBed_Allotment() throws com.mendix.core.CoreException
	{
		return getBed_Allotment(getContext());
	}

	/**
	 * @param context
	 * @return value of Bed_Allotment
	 * @throws com.mendix.core.CoreException
	 */
	public final hms.proxies.Bed getBed_Allotment(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		hms.proxies.Bed result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Bed_Allotment.toString());
		if (identifier != null) {
			result = hms.proxies.Bed.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Bed_Allotment
	 * @param bed_allotment
	 */
	public final void setBed_Allotment(hms.proxies.Bed bed_allotment)
	{
		setBed_Allotment(getContext(), bed_allotment);
	}

	/**
	 * Set value of Bed_Allotment
	 * @param context
	 * @param bed_allotment
	 */
	public final void setBed_Allotment(com.mendix.systemwideinterfaces.core.IContext context, hms.proxies.Bed bed_allotment)
	{
		if (bed_allotment == null) {
			getMendixObject().setValue(context, MemberNames.Bed_Allotment.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Bed_Allotment.toString(), bed_allotment.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return allotmentMendixObject;
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
			final hms.proxies.Allotment that = (hms.proxies.Allotment) obj;
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

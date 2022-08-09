// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package hms.proxies;

public class Tenant extends administration.proxies.Account
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HMS.Tenant";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CNIC("CNIC"),
		EmergencyContact("EmergencyContact"),
		Education("Education"),
		JobHolder("JobHolder"),
		University_Company("University_Company"),
		FullName("FullName"),
		Email("Email"),
		IsLocalUser("IsLocalUser"),
		Name("Name"),
		Password("Password"),
		LastLogin("LastLogin"),
		Blocked("Blocked"),
		BlockedSince("BlockedSince"),
		Active("Active"),
		FailedLogins("FailedLogins"),
		WebServiceUser("WebServiceUser"),
		IsAnonymous("IsAnonymous"),
		Tenant_SystemMedia("HMS.Tenant_SystemMedia"),
		Tenant_Allotment("HMS.Tenant_Allotment"),
		Tenant_Review("HMS.Tenant_Review"),
		Tenant_Wallet("HMS.Tenant_Wallet"),
		UserRoles("System.UserRoles"),
		User_Language("System.User_Language"),
		User_TimeZone("System.User_TimeZone");

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

	public Tenant(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Tenant(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject tenantMendixObject)
	{
		super(context, tenantMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, tenantMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'Tenant.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static hms.proxies.Tenant initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return hms.proxies.Tenant.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static hms.proxies.Tenant initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new hms.proxies.Tenant(context, mendixObject);
	}

	public static hms.proxies.Tenant load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return hms.proxies.Tenant.initialize(context, mendixObject);
	}

	public static java.util.List<hms.proxies.Tenant> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> hms.proxies.Tenant.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of CNIC
	 */
	public final java.lang.String getCNIC()
	{
		return getCNIC(getContext());
	}

	/**
	 * @param context
	 * @return value of CNIC
	 */
	public final java.lang.String getCNIC(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CNIC.toString());
	}

	/**
	 * Set value of CNIC
	 * @param cnic
	 */
	public final void setCNIC(java.lang.String cnic)
	{
		setCNIC(getContext(), cnic);
	}

	/**
	 * Set value of CNIC
	 * @param context
	 * @param cnic
	 */
	public final void setCNIC(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cnic)
	{
		getMendixObject().setValue(context, MemberNames.CNIC.toString(), cnic);
	}

	/**
	 * @return value of EmergencyContact
	 */
	public final java.lang.String getEmergencyContact()
	{
		return getEmergencyContact(getContext());
	}

	/**
	 * @param context
	 * @return value of EmergencyContact
	 */
	public final java.lang.String getEmergencyContact(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EmergencyContact.toString());
	}

	/**
	 * Set value of EmergencyContact
	 * @param emergencycontact
	 */
	public final void setEmergencyContact(java.lang.String emergencycontact)
	{
		setEmergencyContact(getContext(), emergencycontact);
	}

	/**
	 * Set value of EmergencyContact
	 * @param context
	 * @param emergencycontact
	 */
	public final void setEmergencyContact(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emergencycontact)
	{
		getMendixObject().setValue(context, MemberNames.EmergencyContact.toString(), emergencycontact);
	}

	/**
	 * @return value of Education
	 */
	public final java.lang.String getEducation()
	{
		return getEducation(getContext());
	}

	/**
	 * @param context
	 * @return value of Education
	 */
	public final java.lang.String getEducation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Education.toString());
	}

	/**
	 * Set value of Education
	 * @param education
	 */
	public final void setEducation(java.lang.String education)
	{
		setEducation(getContext(), education);
	}

	/**
	 * Set value of Education
	 * @param context
	 * @param education
	 */
	public final void setEducation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String education)
	{
		getMendixObject().setValue(context, MemberNames.Education.toString(), education);
	}

	/**
	 * @return value of JobHolder
	 */
	public final java.lang.Boolean getJobHolder()
	{
		return getJobHolder(getContext());
	}

	/**
	 * @param context
	 * @return value of JobHolder
	 */
	public final java.lang.Boolean getJobHolder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.JobHolder.toString());
	}

	/**
	 * Set value of JobHolder
	 * @param jobholder
	 */
	public final void setJobHolder(java.lang.Boolean jobholder)
	{
		setJobHolder(getContext(), jobholder);
	}

	/**
	 * Set value of JobHolder
	 * @param context
	 * @param jobholder
	 */
	public final void setJobHolder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean jobholder)
	{
		getMendixObject().setValue(context, MemberNames.JobHolder.toString(), jobholder);
	}

	/**
	 * @return value of University_Company
	 */
	public final java.lang.String getUniversity_Company()
	{
		return getUniversity_Company(getContext());
	}

	/**
	 * @param context
	 * @return value of University_Company
	 */
	public final java.lang.String getUniversity_Company(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.University_Company.toString());
	}

	/**
	 * Set value of University_Company
	 * @param university_company
	 */
	public final void setUniversity_Company(java.lang.String university_company)
	{
		setUniversity_Company(getContext(), university_company);
	}

	/**
	 * Set value of University_Company
	 * @param context
	 * @param university_company
	 */
	public final void setUniversity_Company(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String university_company)
	{
		getMendixObject().setValue(context, MemberNames.University_Company.toString(), university_company);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Tenant_SystemMedia
	 */
	public final hms.proxies.SystemMedia getTenant_SystemMedia() throws com.mendix.core.CoreException
	{
		return getTenant_SystemMedia(getContext());
	}

	/**
	 * @param context
	 * @return value of Tenant_SystemMedia
	 * @throws com.mendix.core.CoreException
	 */
	public final hms.proxies.SystemMedia getTenant_SystemMedia(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		hms.proxies.SystemMedia result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tenant_SystemMedia.toString());
		if (identifier != null) {
			result = hms.proxies.SystemMedia.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Tenant_SystemMedia
	 * @param tenant_systemmedia
	 */
	public final void setTenant_SystemMedia(hms.proxies.SystemMedia tenant_systemmedia)
	{
		setTenant_SystemMedia(getContext(), tenant_systemmedia);
	}

	/**
	 * Set value of Tenant_SystemMedia
	 * @param context
	 * @param tenant_systemmedia
	 */
	public final void setTenant_SystemMedia(com.mendix.systemwideinterfaces.core.IContext context, hms.proxies.SystemMedia tenant_systemmedia)
	{
		if (tenant_systemmedia == null) {
			getMendixObject().setValue(context, MemberNames.Tenant_SystemMedia.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Tenant_SystemMedia.toString(), tenant_systemmedia.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Tenant_Allotment
	 */
	public final hms.proxies.Allotment getTenant_Allotment() throws com.mendix.core.CoreException
	{
		return getTenant_Allotment(getContext());
	}

	/**
	 * @param context
	 * @return value of Tenant_Allotment
	 * @throws com.mendix.core.CoreException
	 */
	public final hms.proxies.Allotment getTenant_Allotment(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		hms.proxies.Allotment result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tenant_Allotment.toString());
		if (identifier != null) {
			result = hms.proxies.Allotment.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Tenant_Allotment
	 * @param tenant_allotment
	 */
	public final void setTenant_Allotment(hms.proxies.Allotment tenant_allotment)
	{
		setTenant_Allotment(getContext(), tenant_allotment);
	}

	/**
	 * Set value of Tenant_Allotment
	 * @param context
	 * @param tenant_allotment
	 */
	public final void setTenant_Allotment(com.mendix.systemwideinterfaces.core.IContext context, hms.proxies.Allotment tenant_allotment)
	{
		if (tenant_allotment == null) {
			getMendixObject().setValue(context, MemberNames.Tenant_Allotment.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Tenant_Allotment.toString(), tenant_allotment.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Tenant_Review
	 */
	public final hms.proxies.Review getTenant_Review() throws com.mendix.core.CoreException
	{
		return getTenant_Review(getContext());
	}

	/**
	 * @param context
	 * @return value of Tenant_Review
	 * @throws com.mendix.core.CoreException
	 */
	public final hms.proxies.Review getTenant_Review(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		hms.proxies.Review result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tenant_Review.toString());
		if (identifier != null) {
			result = hms.proxies.Review.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Tenant_Review
	 * @param tenant_review
	 */
	public final void setTenant_Review(hms.proxies.Review tenant_review)
	{
		setTenant_Review(getContext(), tenant_review);
	}

	/**
	 * Set value of Tenant_Review
	 * @param context
	 * @param tenant_review
	 */
	public final void setTenant_Review(com.mendix.systemwideinterfaces.core.IContext context, hms.proxies.Review tenant_review)
	{
		if (tenant_review == null) {
			getMendixObject().setValue(context, MemberNames.Tenant_Review.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Tenant_Review.toString(), tenant_review.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Tenant_Wallet
	 */
	public final hms.proxies.Wallet getTenant_Wallet() throws com.mendix.core.CoreException
	{
		return getTenant_Wallet(getContext());
	}

	/**
	 * @param context
	 * @return value of Tenant_Wallet
	 * @throws com.mendix.core.CoreException
	 */
	public final hms.proxies.Wallet getTenant_Wallet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		hms.proxies.Wallet result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tenant_Wallet.toString());
		if (identifier != null) {
			result = hms.proxies.Wallet.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Tenant_Wallet
	 * @param tenant_wallet
	 */
	public final void setTenant_Wallet(hms.proxies.Wallet tenant_wallet)
	{
		setTenant_Wallet(getContext(), tenant_wallet);
	}

	/**
	 * Set value of Tenant_Wallet
	 * @param context
	 * @param tenant_wallet
	 */
	public final void setTenant_Wallet(com.mendix.systemwideinterfaces.core.IContext context, hms.proxies.Wallet tenant_wallet)
	{
		if (tenant_wallet == null) {
			getMendixObject().setValue(context, MemberNames.Tenant_Wallet.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Tenant_Wallet.toString(), tenant_wallet.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final hms.proxies.Tenant that = (hms.proxies.Tenant) obj;
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
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

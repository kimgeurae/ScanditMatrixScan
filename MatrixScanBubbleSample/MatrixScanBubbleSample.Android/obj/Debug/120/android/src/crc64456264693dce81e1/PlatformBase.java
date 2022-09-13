package crc64456264693dce81e1;


public abstract class PlatformBase
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.Unified.Implementation.PlatformBase, ScanditCaptureCoreUnified", PlatformBase.class, __md_methods);
	}


	public PlatformBase ()
	{
		super ();
		if (getClass () == PlatformBase.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.Unified.Implementation.PlatformBase, ScanditCaptureCoreUnified", "", this, new java.lang.Object[] {  });
		}
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

package mono.com.scandit.datacapture.core.internal.sdk.ui;


public class NeedsRedrawListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_setNeedsRedrawInMillis:(I)V:GetSetNeedsRedrawInMillis_IHandler:Com.Scandit.Datacapture.Core.Internal.Sdk.UI.INeedsRedrawListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Com.Scandit.Datacapture.Core.Internal.Sdk.UI.INeedsRedrawListenerImplementor, ScanditCaptureCore", NeedsRedrawListenerImplementor.class, __md_methods);
	}


	public NeedsRedrawListenerImplementor ()
	{
		super ();
		if (getClass () == NeedsRedrawListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Scandit.Datacapture.Core.Internal.Sdk.UI.INeedsRedrawListenerImplementor, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void setNeedsRedrawInMillis (int p0)
	{
		n_setNeedsRedrawInMillis (p0);
	}

	private native void n_setNeedsRedrawInMillis (int p0);

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

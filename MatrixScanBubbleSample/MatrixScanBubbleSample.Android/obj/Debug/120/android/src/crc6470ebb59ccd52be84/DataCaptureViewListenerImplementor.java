package crc6470ebb59ccd52be84;


public class DataCaptureViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.ui.DataCaptureViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSizeChanged:(III)V:GetOnSizeChanged_IIIHandler:Scandit.DataCapture.Core.UI.IDataCaptureViewListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.UI.DataCaptureViewListenerImplementor, ScanditCaptureCore", DataCaptureViewListenerImplementor.class, __md_methods);
	}


	public DataCaptureViewListenerImplementor ()
	{
		super ();
		if (getClass () == DataCaptureViewListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.UI.DataCaptureViewListenerImplementor, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void onSizeChanged (int p0, int p1, int p2)
	{
		n_onSizeChanged (p0, p1, p2);
	}

	private native void n_onSizeChanged (int p0, int p1, int p2);

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

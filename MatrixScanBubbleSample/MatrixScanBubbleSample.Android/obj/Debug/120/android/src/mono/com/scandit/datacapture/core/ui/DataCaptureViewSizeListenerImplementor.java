package mono.com.scandit.datacapture.core.ui;


public class DataCaptureViewSizeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.ui.DataCaptureViewSizeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSizeChanged:(Lcom/scandit/datacapture/core/ui/DataCaptureView;III)V:GetOnSizeChanged_Lcom_scandit_datacapture_core_ui_DataCaptureView_IIIHandler:Scandit.DataCapture.Core.UI.IDataCaptureViewSizeListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.UI.IDataCaptureViewSizeListenerImplementor, ScanditCaptureCore", DataCaptureViewSizeListenerImplementor.class, __md_methods);
	}


	public DataCaptureViewSizeListenerImplementor ()
	{
		super ();
		if (getClass () == DataCaptureViewSizeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.UI.IDataCaptureViewSizeListenerImplementor, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void onSizeChanged (com.scandit.datacapture.core.ui.DataCaptureView p0, int p1, int p2, int p3)
	{
		n_onSizeChanged (p0, p1, p2, p3);
	}

	private native void n_onSizeChanged (com.scandit.datacapture.core.ui.DataCaptureView p0, int p1, int p2, int p3);

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

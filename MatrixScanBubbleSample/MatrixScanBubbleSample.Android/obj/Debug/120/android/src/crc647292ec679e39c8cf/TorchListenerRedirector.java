package crc647292ec679e39c8cf;


public class TorchListenerRedirector
	extends crc64456264693dce81e1.PlatformBase
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.source.TorchListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTorchStateChanged:(Lcom/scandit/datacapture/core/source/TorchState;)V:GetOnTorchStateChanged_Lcom_scandit_datacapture_core_source_TorchState_Handler:Scandit.DataCapture.Core.Source.ITorchListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.Source.Unified.Implementation.TorchListenerRedirector, ScanditCaptureCoreUnified", TorchListenerRedirector.class, __md_methods);
	}


	public TorchListenerRedirector ()
	{
		super ();
		if (getClass () == TorchListenerRedirector.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.Source.Unified.Implementation.TorchListenerRedirector, ScanditCaptureCoreUnified", "", this, new java.lang.Object[] {  });
		}
	}


	public void onTorchStateChanged (com.scandit.datacapture.core.source.TorchState p0)
	{
		n_onTorchStateChanged (p0);
	}

	private native void n_onTorchStateChanged (com.scandit.datacapture.core.source.TorchState p0);

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

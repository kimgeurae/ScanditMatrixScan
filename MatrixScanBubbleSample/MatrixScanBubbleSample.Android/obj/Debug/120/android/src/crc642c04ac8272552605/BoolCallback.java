package crc642c04ac8272552605;


public class BoolCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.common.async.Callback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_run:(Ljava/lang/Object;)V:GetRun_Ljava_lang_Object_Handler:Scandit.DataCapture.Core.Common.Async.ICallbackInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.Additions.BoolCallback, ScanditCaptureCore", BoolCallback.class, __md_methods);
	}


	public BoolCallback ()
	{
		super ();
		if (getClass () == BoolCallback.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.Additions.BoolCallback, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void run (java.lang.Object p0)
	{
		n_run (p0);
	}

	private native void n_run (java.lang.Object p0);

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

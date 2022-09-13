package mono.com.scandit.datacapture.core.logger;


public class SdcLogger_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.logger.SdcLogger.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEvent:(Lcom/scandit/datacapture/core/logger/Event;)V:GetOnEvent_Lcom_scandit_datacapture_core_logger_Event_Handler:Com.Scandit.Datacapture.Core.Logger.SdcLogger/IListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Com.Scandit.Datacapture.Core.Logger.SdcLogger+IListenerImplementor, ScanditCaptureCore", SdcLogger_ListenerImplementor.class, __md_methods);
	}


	public SdcLogger_ListenerImplementor ()
	{
		super ();
		if (getClass () == SdcLogger_ListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Scandit.Datacapture.Core.Logger.SdcLogger+IListenerImplementor, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void onEvent (com.scandit.datacapture.core.logger.Event p0)
	{
		n_onEvent (p0);
	}

	private native void n_onEvent (com.scandit.datacapture.core.logger.Event p0);

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

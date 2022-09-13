package mono.com.scandit.datacapture.core.source;


public class FrameSourceListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.source.FrameSourceListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFrameOutput:(Lcom/scandit/datacapture/core/source/FrameSource;Lcom/scandit/datacapture/core/data/FrameData;)V:GetOnFrameOutput_Lcom_scandit_datacapture_core_source_FrameSource_Lcom_scandit_datacapture_core_data_FrameData_Handler:Scandit.DataCapture.Core.Source.IFrameSourceListenerInvoker, ScanditCaptureCore\n" +
			"n_onObservationStarted:(Lcom/scandit/datacapture/core/source/FrameSource;)V:GetOnObservationStarted_Lcom_scandit_datacapture_core_source_FrameSource_Handler:Scandit.DataCapture.Core.Source.IFrameSourceListenerInvoker, ScanditCaptureCore\n" +
			"n_onObservationStopped:(Lcom/scandit/datacapture/core/source/FrameSource;)V:GetOnObservationStopped_Lcom_scandit_datacapture_core_source_FrameSource_Handler:Scandit.DataCapture.Core.Source.IFrameSourceListenerInvoker, ScanditCaptureCore\n" +
			"n_onStateChanged:(Lcom/scandit/datacapture/core/source/FrameSource;Lcom/scandit/datacapture/core/source/FrameSourceState;)V:GetOnStateChanged_Lcom_scandit_datacapture_core_source_FrameSource_Lcom_scandit_datacapture_core_source_FrameSourceState_Handler:Scandit.DataCapture.Core.Source.IFrameSourceListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.Source.IFrameSourceListenerImplementor, ScanditCaptureCore", FrameSourceListenerImplementor.class, __md_methods);
	}


	public FrameSourceListenerImplementor ()
	{
		super ();
		if (getClass () == FrameSourceListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.Source.IFrameSourceListenerImplementor, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void onFrameOutput (com.scandit.datacapture.core.source.FrameSource p0, com.scandit.datacapture.core.data.FrameData p1)
	{
		n_onFrameOutput (p0, p1);
	}

	private native void n_onFrameOutput (com.scandit.datacapture.core.source.FrameSource p0, com.scandit.datacapture.core.data.FrameData p1);


	public void onObservationStarted (com.scandit.datacapture.core.source.FrameSource p0)
	{
		n_onObservationStarted (p0);
	}

	private native void n_onObservationStarted (com.scandit.datacapture.core.source.FrameSource p0);


	public void onObservationStopped (com.scandit.datacapture.core.source.FrameSource p0)
	{
		n_onObservationStopped (p0);
	}

	private native void n_onObservationStopped (com.scandit.datacapture.core.source.FrameSource p0);


	public void onStateChanged (com.scandit.datacapture.core.source.FrameSource p0, com.scandit.datacapture.core.source.FrameSourceState p1)
	{
		n_onStateChanged (p0, p1);
	}

	private native void n_onStateChanged (com.scandit.datacapture.core.source.FrameSource p0, com.scandit.datacapture.core.source.FrameSourceState p1);

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

package mono.com.scandit.datacapture.core.capture;


public class DataCaptureContextListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.capture.DataCaptureContextListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFrameSourceChanged:(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/source/FrameSource;)V:GetOnFrameSourceChanged_Lcom_scandit_datacapture_core_capture_DataCaptureContext_Lcom_scandit_datacapture_core_source_FrameSource_Handler:Scandit.DataCapture.Core.Capture.IDataCaptureContextListenerInvoker, ScanditCaptureCore\n" +
			"n_onModeAdded:(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/capture/DataCaptureMode;)V:GetOnModeAdded_Lcom_scandit_datacapture_core_capture_DataCaptureContext_Lcom_scandit_datacapture_core_capture_DataCaptureMode_Handler:Scandit.DataCapture.Core.Capture.IDataCaptureContextListenerInvoker, ScanditCaptureCore\n" +
			"n_onModeRemoved:(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/capture/DataCaptureMode;)V:GetOnModeRemoved_Lcom_scandit_datacapture_core_capture_DataCaptureContext_Lcom_scandit_datacapture_core_capture_DataCaptureMode_Handler:Scandit.DataCapture.Core.Capture.IDataCaptureContextListenerInvoker, ScanditCaptureCore\n" +
			"n_onObservationStarted:(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V:GetOnObservationStarted_Lcom_scandit_datacapture_core_capture_DataCaptureContext_Handler:Scandit.DataCapture.Core.Capture.IDataCaptureContextListenerInvoker, ScanditCaptureCore\n" +
			"n_onObservationStopped:(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V:GetOnObservationStopped_Lcom_scandit_datacapture_core_capture_DataCaptureContext_Handler:Scandit.DataCapture.Core.Capture.IDataCaptureContextListenerInvoker, ScanditCaptureCore\n" +
			"n_onStatusChanged:(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/common/ContextStatus;)V:GetOnStatusChanged_Lcom_scandit_datacapture_core_capture_DataCaptureContext_Lcom_scandit_datacapture_core_common_ContextStatus_Handler:Scandit.DataCapture.Core.Capture.IDataCaptureContextListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.Capture.IDataCaptureContextListenerImplementor, ScanditCaptureCore", DataCaptureContextListenerImplementor.class, __md_methods);
	}


	public DataCaptureContextListenerImplementor ()
	{
		super ();
		if (getClass () == DataCaptureContextListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.Capture.IDataCaptureContextListenerImplementor, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void onFrameSourceChanged (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.source.FrameSource p1)
	{
		n_onFrameSourceChanged (p0, p1);
	}

	private native void n_onFrameSourceChanged (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.source.FrameSource p1);


	public void onModeAdded (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.capture.DataCaptureMode p1)
	{
		n_onModeAdded (p0, p1);
	}

	private native void n_onModeAdded (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.capture.DataCaptureMode p1);


	public void onModeRemoved (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.capture.DataCaptureMode p1)
	{
		n_onModeRemoved (p0, p1);
	}

	private native void n_onModeRemoved (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.capture.DataCaptureMode p1);


	public void onObservationStarted (com.scandit.datacapture.core.capture.DataCaptureContext p0)
	{
		n_onObservationStarted (p0);
	}

	private native void n_onObservationStarted (com.scandit.datacapture.core.capture.DataCaptureContext p0);


	public void onObservationStopped (com.scandit.datacapture.core.capture.DataCaptureContext p0)
	{
		n_onObservationStopped (p0);
	}

	private native void n_onObservationStopped (com.scandit.datacapture.core.capture.DataCaptureContext p0);


	public void onStatusChanged (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.common.ContextStatus p1)
	{
		n_onStatusChanged (p0, p1);
	}

	private native void n_onStatusChanged (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.common.ContextStatus p1);

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

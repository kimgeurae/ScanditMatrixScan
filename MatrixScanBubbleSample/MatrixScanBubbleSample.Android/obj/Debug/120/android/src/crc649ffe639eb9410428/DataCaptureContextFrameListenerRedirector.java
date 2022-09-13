package crc649ffe639eb9410428;


public class DataCaptureContextFrameListenerRedirector
	extends crc64456264693dce81e1.PlatformBase
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFrameProcessingFinished:(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/data/FrameData;)V:GetOnFrameProcessingFinished_Lcom_scandit_datacapture_core_capture_DataCaptureContext_Lcom_scandit_datacapture_core_data_FrameData_Handler:Scandit.DataCapture.Core.Capture.IDataCaptureContextFrameListenerInvoker, ScanditCaptureCore\n" +
			"n_onFrameProcessingStarted:(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/data/FrameData;)V:GetOnFrameProcessingStarted_Lcom_scandit_datacapture_core_capture_DataCaptureContext_Lcom_scandit_datacapture_core_data_FrameData_Handler:Scandit.DataCapture.Core.Capture.IDataCaptureContextFrameListenerInvoker, ScanditCaptureCore\n" +
			"n_onObservationStarted:(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V:GetOnObservationStarted_Lcom_scandit_datacapture_core_capture_DataCaptureContext_Handler:Scandit.DataCapture.Core.Capture.IDataCaptureContextFrameListenerInvoker, ScanditCaptureCore\n" +
			"n_onObservationStopped:(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V:GetOnObservationStopped_Lcom_scandit_datacapture_core_capture_DataCaptureContext_Handler:Scandit.DataCapture.Core.Capture.IDataCaptureContextFrameListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.Capture.Unified.Implementation.DataCaptureContextFrameListenerRedirector, ScanditCaptureCoreUnified", DataCaptureContextFrameListenerRedirector.class, __md_methods);
	}


	public DataCaptureContextFrameListenerRedirector ()
	{
		super ();
		if (getClass () == DataCaptureContextFrameListenerRedirector.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.Capture.Unified.Implementation.DataCaptureContextFrameListenerRedirector, ScanditCaptureCoreUnified", "", this, new java.lang.Object[] {  });
		}
	}


	public void onFrameProcessingFinished (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.data.FrameData p1)
	{
		n_onFrameProcessingFinished (p0, p1);
	}

	private native void n_onFrameProcessingFinished (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.data.FrameData p1);


	public void onFrameProcessingStarted (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.data.FrameData p1)
	{
		n_onFrameProcessingStarted (p0, p1);
	}

	private native void n_onFrameProcessingStarted (com.scandit.datacapture.core.capture.DataCaptureContext p0, com.scandit.datacapture.core.data.FrameData p1);


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

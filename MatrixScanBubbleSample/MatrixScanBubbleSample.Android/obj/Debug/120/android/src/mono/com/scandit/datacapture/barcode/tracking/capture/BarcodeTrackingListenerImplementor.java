package mono.com.scandit.datacapture.barcode.tracking.capture;


public class BarcodeTrackingListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onObservationStarted:(Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;)V:GetOnObservationStarted_Lcom_scandit_datacapture_barcode_tracking_capture_BarcodeTracking_Handler:Scandit.DataCapture.Barcode.Tracking.Capture.IBarcodeTrackingListenerInvoker, ScanditBarcodeCapture\n" +
			"n_onObservationStopped:(Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;)V:GetOnObservationStopped_Lcom_scandit_datacapture_barcode_tracking_capture_BarcodeTracking_Handler:Scandit.DataCapture.Barcode.Tracking.Capture.IBarcodeTrackingListenerInvoker, ScanditBarcodeCapture\n" +
			"n_onSessionUpdated:(Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSession;Lcom/scandit/datacapture/core/data/FrameData;)V:GetOnSessionUpdated_Lcom_scandit_datacapture_barcode_tracking_capture_BarcodeTracking_Lcom_scandit_datacapture_barcode_tracking_capture_BarcodeTrackingSession_Lcom_scandit_datacapture_core_data_FrameData_Handler:Scandit.DataCapture.Barcode.Tracking.Capture.IBarcodeTrackingListenerInvoker, ScanditBarcodeCapture\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Barcode.Tracking.Capture.IBarcodeTrackingListenerImplementor, ScanditBarcodeCapture", BarcodeTrackingListenerImplementor.class, __md_methods);
	}


	public BarcodeTrackingListenerImplementor ()
	{
		super ();
		if (getClass () == BarcodeTrackingListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Barcode.Tracking.Capture.IBarcodeTrackingListenerImplementor, ScanditBarcodeCapture", "", this, new java.lang.Object[] {  });
		}
	}


	public void onObservationStarted (com.scandit.datacapture.barcode.tracking.capture.BarcodeTracking p0)
	{
		n_onObservationStarted (p0);
	}

	private native void n_onObservationStarted (com.scandit.datacapture.barcode.tracking.capture.BarcodeTracking p0);


	public void onObservationStopped (com.scandit.datacapture.barcode.tracking.capture.BarcodeTracking p0)
	{
		n_onObservationStopped (p0);
	}

	private native void n_onObservationStopped (com.scandit.datacapture.barcode.tracking.capture.BarcodeTracking p0);


	public void onSessionUpdated (com.scandit.datacapture.barcode.tracking.capture.BarcodeTracking p0, com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSession p1, com.scandit.datacapture.core.data.FrameData p2)
	{
		n_onSessionUpdated (p0, p1, p2);
	}

	private native void n_onSessionUpdated (com.scandit.datacapture.barcode.tracking.capture.BarcodeTracking p0, com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSession p1, com.scandit.datacapture.core.data.FrameData p2);

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

package mono.com.scandit.datacapture.barcode.capture;


public class BarcodeCaptureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBarcodeScanned:(Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSession;Lcom/scandit/datacapture/core/data/FrameData;)V:GetOnBarcodeScanned_Lcom_scandit_datacapture_barcode_capture_BarcodeCapture_Lcom_scandit_datacapture_barcode_capture_BarcodeCaptureSession_Lcom_scandit_datacapture_core_data_FrameData_Handler:Scandit.DataCapture.Barcode.Capture.IBarcodeCaptureListenerInvoker, ScanditBarcodeCapture\n" +
			"n_onObservationStarted:(Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;)V:GetOnObservationStarted_Lcom_scandit_datacapture_barcode_capture_BarcodeCapture_Handler:Scandit.DataCapture.Barcode.Capture.IBarcodeCaptureListenerInvoker, ScanditBarcodeCapture\n" +
			"n_onObservationStopped:(Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;)V:GetOnObservationStopped_Lcom_scandit_datacapture_barcode_capture_BarcodeCapture_Handler:Scandit.DataCapture.Barcode.Capture.IBarcodeCaptureListenerInvoker, ScanditBarcodeCapture\n" +
			"n_onSessionUpdated:(Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSession;Lcom/scandit/datacapture/core/data/FrameData;)V:GetOnSessionUpdated_Lcom_scandit_datacapture_barcode_capture_BarcodeCapture_Lcom_scandit_datacapture_barcode_capture_BarcodeCaptureSession_Lcom_scandit_datacapture_core_data_FrameData_Handler:Scandit.DataCapture.Barcode.Capture.IBarcodeCaptureListenerInvoker, ScanditBarcodeCapture\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Barcode.Capture.IBarcodeCaptureListenerImplementor, ScanditBarcodeCapture", BarcodeCaptureListenerImplementor.class, __md_methods);
	}


	public BarcodeCaptureListenerImplementor ()
	{
		super ();
		if (getClass () == BarcodeCaptureListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Barcode.Capture.IBarcodeCaptureListenerImplementor, ScanditBarcodeCapture", "", this, new java.lang.Object[] {  });
		}
	}


	public void onBarcodeScanned (com.scandit.datacapture.barcode.capture.BarcodeCapture p0, com.scandit.datacapture.barcode.capture.BarcodeCaptureSession p1, com.scandit.datacapture.core.data.FrameData p2)
	{
		n_onBarcodeScanned (p0, p1, p2);
	}

	private native void n_onBarcodeScanned (com.scandit.datacapture.barcode.capture.BarcodeCapture p0, com.scandit.datacapture.barcode.capture.BarcodeCaptureSession p1, com.scandit.datacapture.core.data.FrameData p2);


	public void onObservationStarted (com.scandit.datacapture.barcode.capture.BarcodeCapture p0)
	{
		n_onObservationStarted (p0);
	}

	private native void n_onObservationStarted (com.scandit.datacapture.barcode.capture.BarcodeCapture p0);


	public void onObservationStopped (com.scandit.datacapture.barcode.capture.BarcodeCapture p0)
	{
		n_onObservationStopped (p0);
	}

	private native void n_onObservationStopped (com.scandit.datacapture.barcode.capture.BarcodeCapture p0);


	public void onSessionUpdated (com.scandit.datacapture.barcode.capture.BarcodeCapture p0, com.scandit.datacapture.barcode.capture.BarcodeCaptureSession p1, com.scandit.datacapture.core.data.FrameData p2)
	{
		n_onSessionUpdated (p0, p1, p2);
	}

	private native void n_onSessionUpdated (com.scandit.datacapture.barcode.capture.BarcodeCapture p0, com.scandit.datacapture.barcode.capture.BarcodeCaptureSession p1, com.scandit.datacapture.core.data.FrameData p2);

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

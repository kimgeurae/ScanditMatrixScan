package mono.com.scandit.datacapture.barcode.selection.capture;


public class BarcodeSelectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onObservationStarted:(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;)V:GetOnObservationStarted_Lcom_scandit_datacapture_barcode_selection_capture_BarcodeSelection_Handler:Scandit.DataCapture.Barcode.Selection.Capture.IBarcodeSelectionListenerInvoker, ScanditBarcodeCapture\n" +
			"n_onObservationStopped:(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;)V:GetOnObservationStopped_Lcom_scandit_datacapture_barcode_selection_capture_BarcodeSelection_Handler:Scandit.DataCapture.Barcode.Selection.Capture.IBarcodeSelectionListenerInvoker, ScanditBarcodeCapture\n" +
			"n_onSelectionUpdated:(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSession;Lcom/scandit/datacapture/core/data/FrameData;)V:GetOnSelectionUpdated_Lcom_scandit_datacapture_barcode_selection_capture_BarcodeSelection_Lcom_scandit_datacapture_barcode_selection_capture_BarcodeSelectionSession_Lcom_scandit_datacapture_core_data_FrameData_Handler:Scandit.DataCapture.Barcode.Selection.Capture.IBarcodeSelectionListenerInvoker, ScanditBarcodeCapture\n" +
			"n_onSessionUpdated:(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSession;Lcom/scandit/datacapture/core/data/FrameData;)V:GetOnSessionUpdated_Lcom_scandit_datacapture_barcode_selection_capture_BarcodeSelection_Lcom_scandit_datacapture_barcode_selection_capture_BarcodeSelectionSession_Lcom_scandit_datacapture_core_data_FrameData_Handler:Scandit.DataCapture.Barcode.Selection.Capture.IBarcodeSelectionListenerInvoker, ScanditBarcodeCapture\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Barcode.Selection.Capture.IBarcodeSelectionListenerImplementor, ScanditBarcodeCapture", BarcodeSelectionListenerImplementor.class, __md_methods);
	}


	public BarcodeSelectionListenerImplementor ()
	{
		super ();
		if (getClass () == BarcodeSelectionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Barcode.Selection.Capture.IBarcodeSelectionListenerImplementor, ScanditBarcodeCapture", "", this, new java.lang.Object[] {  });
		}
	}


	public void onObservationStarted (com.scandit.datacapture.barcode.selection.capture.BarcodeSelection p0)
	{
		n_onObservationStarted (p0);
	}

	private native void n_onObservationStarted (com.scandit.datacapture.barcode.selection.capture.BarcodeSelection p0);


	public void onObservationStopped (com.scandit.datacapture.barcode.selection.capture.BarcodeSelection p0)
	{
		n_onObservationStopped (p0);
	}

	private native void n_onObservationStopped (com.scandit.datacapture.barcode.selection.capture.BarcodeSelection p0);


	public void onSelectionUpdated (com.scandit.datacapture.barcode.selection.capture.BarcodeSelection p0, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSession p1, com.scandit.datacapture.core.data.FrameData p2)
	{
		n_onSelectionUpdated (p0, p1, p2);
	}

	private native void n_onSelectionUpdated (com.scandit.datacapture.barcode.selection.capture.BarcodeSelection p0, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSession p1, com.scandit.datacapture.core.data.FrameData p2);


	public void onSessionUpdated (com.scandit.datacapture.barcode.selection.capture.BarcodeSelection p0, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSession p1, com.scandit.datacapture.core.data.FrameData p2)
	{
		n_onSessionUpdated (p0, p1, p2);
	}

	private native void n_onSessionUpdated (com.scandit.datacapture.barcode.selection.capture.BarcodeSelection p0, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSession p1, com.scandit.datacapture.core.data.FrameData p2);

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

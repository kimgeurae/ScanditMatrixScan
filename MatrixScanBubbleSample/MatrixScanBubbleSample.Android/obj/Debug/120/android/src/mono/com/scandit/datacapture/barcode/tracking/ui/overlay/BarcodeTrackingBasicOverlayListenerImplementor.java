package mono.com.scandit.datacapture.barcode.tracking.ui.overlay;


public class BarcodeTrackingBasicOverlayListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_brushForTrackedBarcode:(Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlay;Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;)Lcom/scandit/datacapture/core/ui/style/Brush;:GetBrushForTrackedBarcode_Lcom_scandit_datacapture_barcode_tracking_ui_overlay_BarcodeTrackingBasicOverlay_Lcom_scandit_datacapture_barcode_tracking_data_TrackedBarcode_Handler:Scandit.DataCapture.Barcode.Tracking.UI.Overlay.IBarcodeTrackingBasicOverlayListenerInvoker, ScanditBarcodeCapture\n" +
			"n_onTrackedBarcodeTapped:(Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlay;Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;)V:GetOnTrackedBarcodeTapped_Lcom_scandit_datacapture_barcode_tracking_ui_overlay_BarcodeTrackingBasicOverlay_Lcom_scandit_datacapture_barcode_tracking_data_TrackedBarcode_Handler:Scandit.DataCapture.Barcode.Tracking.UI.Overlay.IBarcodeTrackingBasicOverlayListenerInvoker, ScanditBarcodeCapture\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Barcode.Tracking.UI.Overlay.IBarcodeTrackingBasicOverlayListenerImplementor, ScanditBarcodeCapture", BarcodeTrackingBasicOverlayListenerImplementor.class, __md_methods);
	}


	public BarcodeTrackingBasicOverlayListenerImplementor ()
	{
		super ();
		if (getClass () == BarcodeTrackingBasicOverlayListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Barcode.Tracking.UI.Overlay.IBarcodeTrackingBasicOverlayListenerImplementor, ScanditBarcodeCapture", "", this, new java.lang.Object[] {  });
		}
	}


	public com.scandit.datacapture.core.ui.style.Brush brushForTrackedBarcode (com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlay p0, com.scandit.datacapture.barcode.tracking.data.TrackedBarcode p1)
	{
		return n_brushForTrackedBarcode (p0, p1);
	}

	private native com.scandit.datacapture.core.ui.style.Brush n_brushForTrackedBarcode (com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlay p0, com.scandit.datacapture.barcode.tracking.data.TrackedBarcode p1);


	public void onTrackedBarcodeTapped (com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlay p0, com.scandit.datacapture.barcode.tracking.data.TrackedBarcode p1)
	{
		n_onTrackedBarcodeTapped (p0, p1);
	}

	private native void n_onTrackedBarcodeTapped (com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlay p0, com.scandit.datacapture.barcode.tracking.data.TrackedBarcode p1);

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

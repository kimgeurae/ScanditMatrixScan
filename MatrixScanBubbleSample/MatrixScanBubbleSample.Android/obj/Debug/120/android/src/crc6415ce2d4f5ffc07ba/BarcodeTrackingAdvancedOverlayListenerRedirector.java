package crc6415ce2d4f5ffc07ba;


public class BarcodeTrackingAdvancedOverlayListenerRedirector
	extends crc64719a2b7f4d69d4bd.PlatformBase
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlayListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_anchorForTrackedBarcode:(Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlay;Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;)Lcom/scandit/datacapture/core/common/geometry/Anchor;:GetAnchorForTrackedBarcode_Lcom_scandit_datacapture_barcode_tracking_ui_overlay_BarcodeTrackingAdvancedOverlay_Lcom_scandit_datacapture_barcode_tracking_data_TrackedBarcode_Handler:Scandit.DataCapture.Barcode.Tracking.UI.Overlay.IBarcodeTrackingAdvancedOverlayListenerInvoker, ScanditBarcodeCapture\n" +
			"n_offsetForTrackedBarcode:(Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlay;Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;Landroid/view/View;)Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;:GetOffsetForTrackedBarcode_Lcom_scandit_datacapture_barcode_tracking_ui_overlay_BarcodeTrackingAdvancedOverlay_Lcom_scandit_datacapture_barcode_tracking_data_TrackedBarcode_Landroid_view_View_Handler:Scandit.DataCapture.Barcode.Tracking.UI.Overlay.IBarcodeTrackingAdvancedOverlayListenerInvoker, ScanditBarcodeCapture\n" +
			"n_viewForTrackedBarcode:(Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlay;Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;)Landroid/view/View;:GetViewForTrackedBarcode_Lcom_scandit_datacapture_barcode_tracking_ui_overlay_BarcodeTrackingAdvancedOverlay_Lcom_scandit_datacapture_barcode_tracking_data_TrackedBarcode_Handler:Scandit.DataCapture.Barcode.Tracking.UI.Overlay.IBarcodeTrackingAdvancedOverlayListenerInvoker, ScanditBarcodeCapture\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Barcode.Tracking.UI.Unified.Implementation.BarcodeTrackingAdvancedOverlayListenerRedirector, ScanditBarcodeCaptureUnified", BarcodeTrackingAdvancedOverlayListenerRedirector.class, __md_methods);
	}


	public BarcodeTrackingAdvancedOverlayListenerRedirector ()
	{
		super ();
		if (getClass () == BarcodeTrackingAdvancedOverlayListenerRedirector.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Barcode.Tracking.UI.Unified.Implementation.BarcodeTrackingAdvancedOverlayListenerRedirector, ScanditBarcodeCaptureUnified", "", this, new java.lang.Object[] {  });
		}
	}


	public com.scandit.datacapture.core.common.geometry.Anchor anchorForTrackedBarcode (com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay p0, com.scandit.datacapture.barcode.tracking.data.TrackedBarcode p1)
	{
		return n_anchorForTrackedBarcode (p0, p1);
	}

	private native com.scandit.datacapture.core.common.geometry.Anchor n_anchorForTrackedBarcode (com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay p0, com.scandit.datacapture.barcode.tracking.data.TrackedBarcode p1);


	public com.scandit.datacapture.core.common.geometry.PointWithUnit offsetForTrackedBarcode (com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay p0, com.scandit.datacapture.barcode.tracking.data.TrackedBarcode p1, android.view.View p2)
	{
		return n_offsetForTrackedBarcode (p0, p1, p2);
	}

	private native com.scandit.datacapture.core.common.geometry.PointWithUnit n_offsetForTrackedBarcode (com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay p0, com.scandit.datacapture.barcode.tracking.data.TrackedBarcode p1, android.view.View p2);


	public android.view.View viewForTrackedBarcode (com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay p0, com.scandit.datacapture.barcode.tracking.data.TrackedBarcode p1)
	{
		return n_viewForTrackedBarcode (p0, p1);
	}

	private native android.view.View n_viewForTrackedBarcode (com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay p0, com.scandit.datacapture.barcode.tracking.data.TrackedBarcode p1);

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

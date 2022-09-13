package mono.com.scandit.datacapture.core.ui.gesture;


public class ZoomGestureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.ui.gesture.ZoomGestureListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onZoomInGesture:(Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;)V:GetOnZoomInGesture_Lcom_scandit_datacapture_core_ui_gesture_ZoomGesture_Handler:Scandit.DataCapture.Core.UI.Gesture.IZoomGestureListenerInvoker, ScanditCaptureCore\n" +
			"n_onZoomOutGesture:(Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;)V:GetOnZoomOutGesture_Lcom_scandit_datacapture_core_ui_gesture_ZoomGesture_Handler:Scandit.DataCapture.Core.UI.Gesture.IZoomGestureListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.UI.Gesture.IZoomGestureListenerImplementor, ScanditCaptureCore", ZoomGestureListenerImplementor.class, __md_methods);
	}


	public ZoomGestureListenerImplementor ()
	{
		super ();
		if (getClass () == ZoomGestureListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.UI.Gesture.IZoomGestureListenerImplementor, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void onZoomInGesture (com.scandit.datacapture.core.ui.gesture.ZoomGesture p0)
	{
		n_onZoomInGesture (p0);
	}

	private native void n_onZoomInGesture (com.scandit.datacapture.core.ui.gesture.ZoomGesture p0);


	public void onZoomOutGesture (com.scandit.datacapture.core.ui.gesture.ZoomGesture p0)
	{
		n_onZoomOutGesture (p0);
	}

	private native void n_onZoomOutGesture (com.scandit.datacapture.core.ui.gesture.ZoomGesture p0);

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

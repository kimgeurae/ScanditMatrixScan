package mono.com.scandit.datacapture.core.ui.gesture;


public class FocusGestureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.ui.gesture.FocusGestureListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFocusGesture:(Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V:GetOnFocusGesture_Lcom_scandit_datacapture_core_ui_gesture_FocusGesture_Lcom_scandit_datacapture_core_common_geometry_PointWithUnit_Handler:Scandit.DataCapture.Core.UI.Gesture.IFocusGestureListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.UI.Gesture.IFocusGestureListenerImplementor, ScanditCaptureCore", FocusGestureListenerImplementor.class, __md_methods);
	}


	public FocusGestureListenerImplementor ()
	{
		super ();
		if (getClass () == FocusGestureListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.UI.Gesture.IFocusGestureListenerImplementor, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void onFocusGesture (com.scandit.datacapture.core.ui.gesture.FocusGesture p0, com.scandit.datacapture.core.common.geometry.PointWithUnit p1)
	{
		n_onFocusGesture (p0, p1);
	}

	private native void n_onFocusGesture (com.scandit.datacapture.core.ui.gesture.FocusGesture p0, com.scandit.datacapture.core.common.geometry.PointWithUnit p1);

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

package mono.com.scandit.datacapture.core.ui.animation;


public class DynamicAnimation_OnAnimationUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.ui.animation.DynamicAnimation.OnAnimationUpdateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnimationUpdate:(Lcom/scandit/datacapture/core/ui/animation/DynamicAnimation;FF)V:GetOnAnimationUpdate_Lcom_scandit_datacapture_core_ui_animation_DynamicAnimation_FFHandler:Scandit.DataCapture.Core.UI.Animation.DynamicAnimation/IOnAnimationUpdateListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.UI.Animation.DynamicAnimation+IOnAnimationUpdateListenerImplementor, ScanditCaptureCore", DynamicAnimation_OnAnimationUpdateListenerImplementor.class, __md_methods);
	}


	public DynamicAnimation_OnAnimationUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == DynamicAnimation_OnAnimationUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.UI.Animation.DynamicAnimation+IOnAnimationUpdateListenerImplementor, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAnimationUpdate (com.scandit.datacapture.core.ui.animation.DynamicAnimation p0, float p1, float p2)
	{
		n_onAnimationUpdate (p0, p1, p2);
	}

	private native void n_onAnimationUpdate (com.scandit.datacapture.core.ui.animation.DynamicAnimation p0, float p1, float p2);

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

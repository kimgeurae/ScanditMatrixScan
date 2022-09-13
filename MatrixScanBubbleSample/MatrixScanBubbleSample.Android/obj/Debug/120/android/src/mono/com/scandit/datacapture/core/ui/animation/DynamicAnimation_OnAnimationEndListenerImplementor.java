package mono.com.scandit.datacapture.core.ui.animation;


public class DynamicAnimation_OnAnimationEndListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.ui.animation.DynamicAnimation.OnAnimationEndListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnimationEnd:(Lcom/scandit/datacapture/core/ui/animation/DynamicAnimation;ZFF)V:GetOnAnimationEnd_Lcom_scandit_datacapture_core_ui_animation_DynamicAnimation_ZFFHandler:Scandit.DataCapture.Core.UI.Animation.DynamicAnimation/IOnAnimationEndListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.UI.Animation.DynamicAnimation+IOnAnimationEndListenerImplementor, ScanditCaptureCore", DynamicAnimation_OnAnimationEndListenerImplementor.class, __md_methods);
	}


	public DynamicAnimation_OnAnimationEndListenerImplementor ()
	{
		super ();
		if (getClass () == DynamicAnimation_OnAnimationEndListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.UI.Animation.DynamicAnimation+IOnAnimationEndListenerImplementor, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAnimationEnd (com.scandit.datacapture.core.ui.animation.DynamicAnimation p0, boolean p1, float p2, float p3)
	{
		n_onAnimationEnd (p0, p1, p2, p3);
	}

	private native void n_onAnimationEnd (com.scandit.datacapture.core.ui.animation.DynamicAnimation p0, boolean p1, float p2, float p3);

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

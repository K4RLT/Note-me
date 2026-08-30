package k9;
import r.e;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.px;
import com.google.android.gms.internal.ads.sl;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class i0 extends g0 {
    @Override // eb.y
    public final void l(final Activity activity) {
        int i;
        if (((Boolean) g9.e.f17698c.a(sl.N1)).booleanValue() && f9.k.C.f16817h.g().q() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            i = attributes.layoutInDisplayCutoutMode;
            if (1 != i) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: k9.h0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i10;
                    DisplayCutout displayCutout;
                    List<Rect> boundingRects;
                    f9.k kVar = f9.k.C;
                    if (kVar.f16817h.g().q() == null) {
                        displayCutout = windowInsets.getDisplayCutout();
                        px pxVar = kVar.f16817h;
                        String str = "";
                        if (displayCutout != null) {
                            c0 g8 = pxVar.g();
                            boundingRects = displayCutout.getBoundingRects();
                            for (Rect rect : boundingRects) {
                                Locale locale = Locale.US;
                                int i11 = rect.left;
                                int i12 = rect.top;
                                int i13 = rect.right;
                                int i14 = rect.bottom;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(i11);
                                sb2.append(",");
                                sb2.append(i12);
                                sb2.append(",");
                                sb2.append(i13);
                                String f10 = a5.a.f(i14, ",", sb2);
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("|");
                                }
                                str = str.concat(f10);
                            }
                            g8.r(str);
                        } else {
                            pxVar.g().r("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    i10 = attributes2.layoutInDisplayCutoutMode;
                    if (2 != i10) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    @Override // eb.y
    public final int m(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }
}

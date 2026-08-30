package wa;
import f0.a;
import h9.b;
import r.e;
import f9.k;
import g9.p;
import g9.r;
import k9.a0;
import k9.f0;
import l9.d;
import l9.i;
import wa.h9;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.a31;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.o31;
import com.google.android.gms.internal.ads.p31;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.qp0;
import com.google.android.gms.internal.ads.sl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class h9 {
    public static boolean a(int i) {
        nl nlVar = sl.f10886p4;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            if (!((Boolean) rVar.f17698c.a(sl.f10903q4)).booleanValue() && i > 15299999) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:3|(7:4|5|(5:8|9|10|11|6)|57|58|(1:60)(1:63)|61)|14|(11:49|50|17|18|19|(2:21|(6:25|26|27|(3:36|37|(1:39))|29|(2:31|32)))(2:43|(6:45|46|27|(0)|29|(0)))|42|27|(0)|29|(0))|16|17|18|19|(0)(0)|42|27|(0)|29|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0135, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0149, code lost:
    
        r2 = a0.f19634b;
        i.d("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject b(android.content.Context r17, android.view.View r18) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.h9.b(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject c(View view) {
        int positionForView;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                nl nlVar = sl.Y8;
                r rVar = r.e;
                ql qlVar = rVar.f17698c;
                ql qlVar2 = rVar.f17698c;
                boolean booleanValue = ((Boolean) qlVar.a(nlVar)).booleanValue();
                boolean z3 = false;
                if (booleanValue) {
                    if (((Boolean) qlVar2.a(sl.Z8)).booleanValue()) {
                        f0 f0Var = k.C.f16813c;
                        if (f0.a(view) != 0) {
                            z3 = true;
                        }
                        jSONObject.put("contained_in_scroll_view", z3);
                    }
                    if (((Boolean) qlVar2.a(sl.f10652a9)).booleanValue()) {
                        f0 f0Var2 = k.C.f16813c;
                        jSONObject.put("scroll_view_type", f0.a(view));
                        return jSONObject;
                    }
                } else {
                    f0 f0Var3 = k.C.f16813c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    if (parent == null) {
                        positionForView = -1;
                    } else {
                        positionForView = ((AdapterView) parent).getPositionForView(view);
                    }
                    if (positionForView != -1) {
                        z3 = true;
                    }
                    jSONObject.put("contained_in_scroll_view", z3);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject d(Context context, View view) {
        KeyguardManager keyguardManager;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                f0 f0Var = k.C.f16813c;
                jSONObject.put("can_show_on_lock_screen", f0.K(view));
                boolean z3 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    if (systemService != null && (systemService instanceof KeyguardManager)) {
                        keyguardManager = (KeyguardManager) systemService;
                    } else {
                        keyguardManager = null;
                    }
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z3 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z3);
                return jSONObject;
            } catch (JSONException unused) {
                int i = a0.f19634b;
                i.f("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject e(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        int[] iArr;
        int measuredWidth;
        JSONObject jSONObject;
        boolean z3;
        ViewGroup.LayoutParams layoutParams;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                    } catch (JSONException unused) {
                        iArr = iArr2;
                    }
                    try {
                        p pVar = p.f17688g;
                        jSONObject4.put("width", pVar.f17689a.h(context, measuredWidth));
                        jSONObject4.put("height", pVar.f17689a.h(context, view2.getMeasuredHeight()));
                        jSONObject4.put("x", pVar.f17689a.h(context, iArr3[0] - iArr[0]));
                        jSONObject4.put("y", pVar.f17689a.h(context, iArr3[1] - iArr[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = j(context, rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", pVar.f17689a.h(context, iArr3[0] - iArr[0]));
                            jSONObject.put("y", pVar.f17689a.h(context, iArr3[1] - iArr[1]));
                            jSONObject.put("relative_to", "ad_view");
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (((String) entry.getKey()).equals("3010")) {
                            nl nlVar = sl.f10668b9;
                            r rVar = r.e;
                            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                                jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                            }
                            if (((Boolean) rVar.f17698c.a(sl.f10684c9)).booleanValue() && (layoutParams = view2.getLayoutParams()) != null) {
                                jSONObject3.put("view_width_layout_type", k(layoutParams.width) - 1);
                                jSONObject3.put("view_height_layout_type", k(layoutParams.height) - 1);
                            }
                            if (((Boolean) rVar.f17698c.a(sl.f10731f9)).booleanValue()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Integer.valueOf(view2.getId()));
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    arrayList.add(Integer.valueOf(((View) parent).getId()));
                                }
                                jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                            }
                            if (scaleType != null) {
                                jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                            }
                        }
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        if (map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        jSONObject3.put("is_clickable", z3);
                        if (((Boolean) r.e.f17698c.a(sl.f10747g9)).booleanValue()) {
                            jSONObject3.put("alpha", view2.getAlpha());
                        }
                        jSONObject2.put((String) entry.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        int i10 = a0.f19634b;
                        i.f("Unable to get asset views information");
                        it = it2;
                        iArr2 = iArr;
                        i = 2;
                    }
                    it = it2;
                    iArr2 = iArr;
                    i = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject f(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                int i = point2.x;
                p pVar = p.f17688g;
                jSONObject3.put("x", pVar.f17689a.h(context, i));
                jSONObject3.put("y", pVar.f17689a.h(context, point2.y));
                jSONObject3.put("start_x", pVar.f17689a.h(context, point.x));
                jSONObject3.put("start_y", pVar.f17689a.h(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e8) {
                int i10 = a0.f19634b;
                i.d("Error occurred while putting signals into JSON object.", e8);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            jSONObject2 = jSONObject;
            int i11 = a0.f19634b;
            i.d("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static boolean g(Context context, qp0 qp0Var) {
        o31 o31Var;
        if (qp0Var.N) {
            nl nlVar = sl.f10763h9;
            r rVar = r.e;
            ql qlVar = rVar.f17698c;
            ql qlVar2 = rVar.f17698c;
            if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
                return ((Boolean) qlVar2.a(sl.f10810k9)).booleanValue();
            }
            String str = (String) qlVar2.a(sl.f10779i9);
            if (!str.isEmpty() && context != null) {
                String packageName = context.getPackageName();
                mf b10 = mf.b(new a31(';'));
                Iterator f10 = ((p31) b10.f8338w).f(b10, str);
                do {
                    o31Var = (o31) f10;
                    if (!o31Var.hasNext()) {
                        return false;
                    }
                } while (!((String) o31Var.next()).equals(packageName));
                return true;
            }
            return false;
        }
        return false;
    }

    public static JSONObject h(Context context) {
        JSONObject jSONObject = new JSONObject();
        f0 f0Var = k.C.f16813c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i = displayMetrics.widthPixels;
            p pVar = p.f17688g;
            jSONObject.put("width", pVar.f17689a.h(context, i));
            jSONObject.put("height", pVar.f17689a.h(context, displayMetrics.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams i() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) r.e.f17698c.a(sl.f10795j9)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject j(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        int i = rect.right - rect.left;
        p pVar = p.f17688g;
        jSONObject.put("width", pVar.f17689a.h(context, i));
        int i10 = rect.bottom - rect.top;
        d dVar = pVar.f17689a;
        jSONObject.put("height", dVar.h(context, i10));
        jSONObject.put("x", dVar.h(context, rect.left));
        jSONObject.put("y", dVar.h(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int k(int i) {
        if (i != -2) {
            if (i != -1) {
                return 2;
            }
            return 3;
        }
        return 4;
    }
}

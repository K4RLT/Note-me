package ya;
import g5.q;
import q3.o;
import q3.p;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.daren.scraply.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ca {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f31181a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f31182b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [o, java.lang.Object] */
    public static boolean a(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        boolean z3 = p.f23420a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = o.f23416d;
            o oVar = (o) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            o oVar2 = oVar;
            if (oVar == null) {
                Object obj = new Object();
                obj.f23417a = null;
                obj.f23418b = null;
                obj.f23419c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                oVar2 = obj;
            }
            WeakReference weakReference2 = oVar2.f23419c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                oVar2.f23419c = new WeakReference(keyEvent);
                if (oVar2.f23418b == null) {
                    oVar2.f23418b = new SparseArray();
                }
                SparseArray sparseArray = oVar2.f23418b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    q.b();
                    return false;
                }
            }
        }
        return false;
    }
}
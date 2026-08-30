package ea;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import b0.e1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x extends Fragment {

    /* renamed from: v, reason: collision with root package name */
    public static final WeakHashMap f16048v = new WeakHashMap();

    /* renamed from: u, reason: collision with root package name */
    public final e1 f16049u = new e1(6, (byte) 0);

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f16049u.f1180c).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        Iterator it = ((Map) this.f16049u.f1180c).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        e1 e1Var = this.f16049u;
        e1Var.f1179b = 1;
        e1Var.f1181d = bundle;
        for (Map.Entry entry : ((Map) e1Var.f1180c).entrySet()) {
            e eVar = (e) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            eVar.c(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        e1 e1Var = this.f16049u;
        e1Var.f1179b = 5;
        Iterator it = ((Map) e1Var.f1180c).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        e1 e1Var = this.f16049u;
        e1Var.f1179b = 3;
        Iterator it = ((Map) e1Var.f1180c).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        e1 e1Var = this.f16049u;
        if (bundle == null) {
            e1Var.getClass();
            return;
        }
        for (Map.Entry entry : ((Map) e1Var.f1180c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((e) entry.getValue()).getClass();
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        e1 e1Var = this.f16049u;
        e1Var.f1179b = 2;
        Iterator it = ((Map) e1Var.f1180c).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).f();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        e1 e1Var = this.f16049u;
        e1Var.f1179b = 4;
        Iterator it = ((Map) e1Var.f1180c).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).g();
        }
    }
}

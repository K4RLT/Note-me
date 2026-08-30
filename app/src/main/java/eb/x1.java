package eb;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final /* synthetic */ class x1 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ t1 f16453a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        t1 t1Var = this.f16453a;
        t1Var.getClass();
        if ("IABTCF_TCString".equals(str)) {
            t1Var.f().I.g("IABTCF_TCString change picked up in listener.");
            a2 a2Var = t1Var.O;
            fa.y.h(a2Var);
            a2Var.b(500L);
        }
    }
}

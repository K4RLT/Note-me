package c7;
import p.a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3946a;

    /* renamed from: b, reason: collision with root package name */
    public int f3947b;

    /* renamed from: c, reason: collision with root package name */
    public String f3948c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ba.r] */
    public static ba.r a() {
        Object obj = new Object();
        obj.f3162v = 0;
        obj.f3163w = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.i iVar;
        int i = this.f3946a;
        int i10 = com.google.android.gms.internal.play_billing.t.f15532a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.i.f15437w;
        Integer valueOf = Integer.valueOf(i);
        if (!a0Var.containsKey(valueOf)) {
            iVar = com.google.android.gms.internal.play_billing.i.RESPONSE_CODE_UNSPECIFIED;
        } else {
            iVar = (com.google.android.gms.internal.play_billing.i) a0Var.get(valueOf);
        }
        return a.l("Response Code: ", iVar.toString(), ", Debug Message: ", this.f3948c);
    }
}
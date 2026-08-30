package gg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {
    public static final /* synthetic */ w[] A;
    public static final /* synthetic */ we.b B;

    /* renamed from: w, reason: collision with root package name */
    public static final w f17809w;

    /* renamed from: x, reason: collision with root package name */
    public static final w f17810x;

    /* renamed from: y, reason: collision with root package name */
    public static final w f17811y;

    /* renamed from: z, reason: collision with root package name */
    public static final w f17812z;

    /* renamed from: u, reason: collision with root package name */
    public final char f17813u;

    /* renamed from: v, reason: collision with root package name */
    public final char f17814v;

    static {
        w wVar = new w("OBJ", 0, '{', '}');
        f17809w = wVar;
        w wVar2 = new w("LIST", 1, '[', ']');
        f17810x = wVar2;
        w wVar3 = new w("MAP", 2, '{', '}');
        f17811y = wVar3;
        w wVar4 = new w("POLY_OBJ", 3, '[', ']');
        f17812z = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        A = wVarArr;
        B = new we.b(wVarArr);
    }

    public w(String str, int i, char c10, char c11) {
        this.f17813u = c10;
        this.f17814v = c11;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) A.clone();
    }
}

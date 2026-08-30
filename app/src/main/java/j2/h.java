package j2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f18787a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.m f18788b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(df.a aVar, df.a aVar2) {
        this.f18787a = (kotlin.jvm.internal.m) aVar;
        this.f18788b = (kotlin.jvm.internal.m) aVar2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.internal.m, df.a] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f18787a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f18788b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}

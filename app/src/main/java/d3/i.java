package d3;

/* loaded from: classes.dex */
public final class i extends g {
    public final /* synthetic */ j B;

    public i(j jVar) {
        this.B = jVar;
    }

    @Override // d3.g
    public final String i() {
        h hVar = (h) this.B.f15722u.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f15718a + "]";
    }
}

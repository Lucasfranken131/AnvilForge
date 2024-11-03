package AnvilForge;

public class CreateBlock extends CreateFile {

    public CreateBlock(String nomeMod, String nomeItem) {
        super(nomeMod, nomeItem);
        nomeArquivo = "src/AnvilForge/assets/" + nomeMod + "/models/blocks/" + nomeItem + ".json";
    }

    public void createBlockItem() {
        String[] texto = {
            "{",
            "   \"parent\": \"" + nomeMod + ":block/" + nomeItem + "\"",
            "}"
        };
        writeFile(texto, nomeArquivo);
        createBlockState();
    }

    private void createBlockState() {
        setNomeArquivo("src/AnvilForge/assets/" + nomeMod + "/blockstates/" + nomeItem + ".json");
        String[] texto = {
            "{",
            "   \"variants\": {",
            "       \"\": {",
            "           \"model\": \"" + nomeMod + ":block/" + nomeItem + "\"",
            "       }",
            "   }",
            "}"
        };

        writeFile(texto, nomeArquivo);
    }
}

package me.jddev0.epct.datagen.recipe;

import com.epherical.croptopia.common.MiscNames;
import com.epherical.croptopia.register.Content;
import com.epherical.croptopia.register.helpers.FarmlandCrop;
import me.jddev0.ep.recipe.*;
import me.jddev0.epct.EnergizedPowerCTMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.NeoForgeConditions;

public class ModRecipeGenerator extends RecipeProvider {
    private static final String CROPTOPIA_MOD_ID = MiscNames.MOD_ID;
    private static final String PATH_PREFIX = "compat/" + CROPTOPIA_MOD_ID + "/";

    public ModRecipeGenerator(HolderLookup.Provider registries, RecipeOutput recipeOutput) {
        super(registries, recipeOutput);
    }

    @Override
    protected void buildRecipes() {
        buildPulverizerRecipes(output);
        buildPlantGrowthChamberRecipes(output);
    }

    private void buildPulverizerRecipes(RecipeOutput output) {
        addPulverizerRecipe(output, ingredientOf(Content.SALT_ORE),
                new PulverizerRecipe.OutputItemStackWithPercentages(new ItemStackTemplate(Content.SALT), new double[] {
                        1., 1., 1., 1., .5, .5
                }, new double[] {
                        1., 1., 1., 1., .75, .5, .25
                }),
                "salt_ore");
    }

    private void buildPlantGrowthChamberRecipes(RecipeOutput output) {
        addBasicCropGrowingRecipeNoSeeds(output, Content.ARTICHOKE);
        addBasicCropGrowingRecipeNoSeeds(output, Content.ASPARAGUS);
        addBasicCropGrowingRecipeNoSeeds(output, Content.BARLEY);
        addBasicCropGrowingRecipeNoSeeds(output, Content.BASIL);
        addBasicCropGrowingRecipeNoSeeds(output, Content.BELLPEPPER);
        addBasicCropGrowingRecipeNoSeeds(output, Content.BLACKBEAN);
        addBasicCropGrowingRecipeNoSeeds(output, Content.BLACKBERRY);
        addBasicCropGrowingRecipeNoSeeds(output, Content.BLUEBERRY);
        addBasicCropGrowingRecipeNoSeeds(output, Content.BROCCOLI);
        addBasicCropGrowingRecipeNoSeeds(output, Content.CABBAGE);
        addBasicCropGrowingRecipeNoSeeds(output, Content.CANTALOUPE);
        addBasicCropGrowingRecipeNoSeeds(output, Content.CAULIFLOWER);
        addBasicCropGrowingRecipeNoSeeds(output, Content.CELERY);
        addBasicCropGrowingRecipeNoSeeds(output, Content.CHILE_PEPPER);
        addBasicCropGrowingRecipeNoSeeds(output, Content.COFFEE_BEANS);
        addBasicCropGrowingRecipeNoSeeds(output, Content.CORN);
        addBasicCropGrowingRecipeNoSeeds(output, Content.CRANBERRY);
        addBasicCropGrowingRecipeNoSeeds(output, Content.CUCUMBER);
        addBasicCropGrowingRecipeNoSeeds(output, Content.CURRANT);
        addBasicCropGrowingRecipeNoSeeds(output, Content.EGGPLANT);
        addBasicCropGrowingRecipeNoSeeds(output, Content.ELDERBERRY);
        addBasicCropGrowingRecipeNoSeeds(output, Content.GARLIC);
        addBasicCropGrowingRecipeNoSeeds(output, Content.GINGER);
        addBasicCropGrowingRecipeNoSeeds(output, Content.GRAPE);
        addBasicCropGrowingRecipeNoSeeds(output, Content.GREENBEAN);
        addBasicCropGrowingRecipeNoSeeds(output, Content.GREENONION);
        addBasicCropGrowingRecipeNoSeeds(output, Content.HONEYDEW);
        addBasicCropGrowingRecipeNoSeeds(output, Content.HOPS);
        addBasicCropGrowingRecipeNoSeeds(output, Content.KALE);
        addBasicCropGrowingRecipeNoSeeds(output, Content.KIWI);
        addBasicCropGrowingRecipeNoSeeds(output, Content.LEEK);
        addBasicCropGrowingRecipeNoSeeds(output, Content.LETTUCE);
        addBasicCropGrowingRecipeNoSeeds(output, Content.MUSTARD);
        addBasicCropGrowingRecipeNoSeeds(output, Content.OAT);
        addBasicCropGrowingRecipeNoSeeds(output, Content.OLIVE);
        addBasicCropGrowingRecipeNoSeeds(output, Content.ONION);
        addBasicCropGrowingRecipeNoSeeds(output, Content.PEANUT);
        addBasicCropGrowingRecipeNoSeeds(output, Content.PEPPER);
        addBasicCropGrowingRecipeNoSeeds(output, Content.PINEAPPLE);
        addBasicCropGrowingRecipeNoSeeds(output, Content.RADISH);
        addBasicCropGrowingRecipeNoSeeds(output, Content.RASPBERRY);
        addBasicCropGrowingRecipeNoSeeds(output, Content.RHUBARB);
        addBasicCropGrowingRecipeNoSeeds(output, Content.RICE);
        addBasicCropGrowingRecipeNoSeeds(output, Content.RUTABAGA);
        addBasicCropGrowingRecipeNoSeeds(output, Content.SAGUARO);
        addBasicCropGrowingRecipeNoSeeds(output, Content.SOYBEAN);
        addBasicCropGrowingRecipeNoSeeds(output, Content.SPINACH);
        addBasicCropGrowingRecipeNoSeeds(output, Content.SQUASH);
        addBasicCropGrowingRecipeNoSeeds(output, Content.STRAWBERRY);
        addBasicCropGrowingRecipeNoSeeds(output, Content.SWEETPOTATO);
        addBasicCropGrowingRecipeNoSeeds(output, Content.TEA_LEAVES);
        addBasicCropGrowingRecipeNoSeeds(output, Content.TOMATILLO);
        addBasicCropGrowingRecipeNoSeeds(output, Content.TOMATO);
        addBasicCropGrowingRecipeNoSeeds(output, Content.TURMERIC);
        addBasicCropGrowingRecipeNoSeeds(output, Content.TURNIP);
        addBasicCropGrowingRecipeNoSeeds(output, Content.VANILLA);
        addBasicCropGrowingRecipeNoSeeds(output, Content.YAM);
        addBasicCropGrowingRecipeNoSeeds(output, Content.ZUCCHINI);
    }

    private void addPulverizerRecipe(RecipeOutput recipeOutput, Ingredient input,
                                     PulverizerRecipe.OutputItemStackWithPercentages output,
                                     String recipeIngredientName) {
        addPulverizerRecipe(recipeOutput, input, output,
                new PulverizerRecipe.OutputItemStackWithPercentages(null, new double[0], new double[0]), recipeIngredientName);
    }
    private void addPulverizerRecipe(RecipeOutput recipeOutput, Ingredient input,
                                     PulverizerRecipe.OutputItemStackWithPercentages output,
                                     PulverizerRecipe.OutputItemStackWithPercentages secondaryOutput,
                                     String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerCTMod.MODID, PATH_PREFIX + "pulverizer/" +
                getItemName(output.output().item().value()) + "_from_pulverizing_" + recipeIngredientName);

        PulverizerRecipe recipe = new PulverizerRecipe(output, secondaryOutput, input);
        recipeOutput.accept(getKey(recipeId), recipe, null, NeoForgeConditions.modLoaded(CROPTOPIA_MOD_ID));
    }

    private void addBasicCropGrowingRecipeNoSeeds(RecipeOutput recipeOutput, FarmlandCrop farmlandCrop) {
        addPlantGrowthChamberRecipe(recipeOutput, ingredientOf(farmlandCrop.getSeedItem()), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(farmlandCrop.asItem()), new double[] {
                        1., .75, .25, .25
                }),
        }, 16000, getItemName(farmlandCrop.asItem()), getItemName(farmlandCrop.getSeedItem()));
    }
    private void addPlantGrowthChamberRecipe(RecipeOutput recipeOutput, Ingredient input,
                                             OutputItemStackTemplateWithPercentages[] outputs, int ticks,
                                             String outputName, String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerCTMod.MODID, PATH_PREFIX + "growing/" +
                outputName + "_from_growing_" + recipeIngredientName);

        PlantGrowthChamberRecipe recipe = new PlantGrowthChamberRecipe(outputs, input, ticks);
        recipeOutput.accept(getKey(recipeId), recipe, null, NeoForgeConditions.modLoaded(CROPTOPIA_MOD_ID));
    }

    private Ingredient ingredientOf(ItemLike item) {
        return Ingredient.of(item);
    }

    private static ResourceKey<Recipe<?>> getKey(Identifier recipeId) {
        return ResourceKey.create(Registries.RECIPE, recipeId);
    }
}

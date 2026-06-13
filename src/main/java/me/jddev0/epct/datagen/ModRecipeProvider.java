package me.jddev0.epct.datagen;

import com.epherical.croptopia.common.MiscNames;
import com.epherical.croptopia.register.Content;
import com.epherical.croptopia.register.helpers.FarmlandCrop;
import me.jddev0.ep.recipe.OutputItemStackWithPercentages;
import me.jddev0.ep.recipe.PlantGrowthChamberRecipe;
import me.jddev0.ep.recipe.PulverizerRecipe;
import me.jddev0.epct.EnergizedPowerCTMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final String CROPTOPIA_MOD_ID = MiscNames.MOD_ID;
    private static final String PATH_PREFIX = "compat/" + CROPTOPIA_MOD_ID + "/";

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    public void buildRecipes(RecipeOutput output) {
        buildPulverizerRecipes(output);
        buildPlantGrowthChamberRecipes(output);
    }

    private void buildPulverizerRecipes(RecipeOutput output) {
        addPulverizerRecipe(output, Ingredient.of(Content.SALT_ORE),
                new PulverizerRecipe.OutputItemStackWithPercentages(new ItemStack(Content.SALT), new double[] {
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

    private void addPulverizerRecipe(RecipeOutput RecipeExporter, Ingredient input,
                                     PulverizerRecipe.OutputItemStackWithPercentages output,
                                     String recipeIngredientName) {
        addPulverizerRecipe(RecipeExporter, input, output,
                new PulverizerRecipe.OutputItemStackWithPercentages(ItemStack.EMPTY, new double[0], new double[0]), recipeIngredientName);
    }
    private void addPulverizerRecipe(RecipeOutput RecipeExporter, Ingredient input,
                                     PulverizerRecipe.OutputItemStackWithPercentages output,
                                     PulverizerRecipe.OutputItemStackWithPercentages secondaryOutput,
                                     String recipeIngredientName) {
        ResourceLocation recipeId = ResourceLocation.fromNamespaceAndPath(EnergizedPowerCTMod.MODID, PATH_PREFIX + "pulverizer/" +
                getItemName(output.output().getItem()) + "_from_pulverizing_" + recipeIngredientName);

        PulverizerRecipe recipe = new PulverizerRecipe(output, secondaryOutput, input);
        RecipeExporter.accept(recipeId, recipe, null);
    }

    private void addBasicCropGrowingRecipeNoSeeds(RecipeOutput RecipeExporter, FarmlandCrop farmlandCrop) {
        addPlantGrowthChamberRecipe(RecipeExporter, Ingredient.of(farmlandCrop.getSeedItem()), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(farmlandCrop.asItem()), new double[] {
                        1., .75, .25, .25
                }),
        }, 16000, getItemName(farmlandCrop.asItem()), getItemName(farmlandCrop.getSeedItem()));
    }
    private void addPlantGrowthChamberRecipe(RecipeOutput RecipeExporter, Ingredient input,
                                             OutputItemStackWithPercentages[] outputs, int ticks,
                                             String outputName, String recipeIngredientName) {
        ResourceLocation recipeId = ResourceLocation.fromNamespaceAndPath(EnergizedPowerCTMod.MODID, PATH_PREFIX + "growing/" +
                outputName + "_from_growing_" + recipeIngredientName);

        PlantGrowthChamberRecipe recipe = new PlantGrowthChamberRecipe(outputs, input, ticks);
        RecipeExporter.accept(recipeId, recipe, null);
    }
}

package Recipes.ChaosRecipes;

import static gregtech.api.enums.TierEU.RECIPE_UV;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import java.util.ArrayList;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.AntimatterOfChaosFrontend;

public class ChaosAntimatterRecipes {

    public static final RecipeMap<RecipeMapBackend> AntimatterRecipes = RecipeMapBuilder.of("Chaos of Antimatter")
        .maxIO(0, 0, 5, 1)
        .minInputs(0, 5)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(AntimatterOfChaosFrontend::new)
        .build();

    private static class MagneticStabilization {

        FluidStack MagneticFluid;
        int MagneticModulus;

        public MagneticStabilization(FluidStack MagneticFluid, int MagneticModulus) {
            this.MagneticFluid = MagneticFluid;
            this.MagneticModulus = MagneticModulus;
        }
    }

    private static class GravityStabilization {

        FluidStack GravityFluid;
        int GravityModulus;

        public GravityStabilization(FluidStack GravityFluid, int GravityModulus) {
            this.GravityFluid = GravityFluid;
            this.GravityModulus = GravityModulus;
        }
    }

    private static class ContainmentStabilization {

        FluidStack ContainmentFluid;
        int ContainmentModulus;

        public ContainmentStabilization(FluidStack ContainmentFluid, int ContainmentModulus) {
            this.ContainmentFluid = ContainmentFluid;
            this.ContainmentModulus = ContainmentModulus;
        }
    }

    private static class ActivationStabilization {

        FluidStack ActivationFluid;
        int ActivationModulus;

        public ActivationStabilization(FluidStack ActivationFluid, int ActivationModulus) {
            this.ActivationFluid = ActivationFluid;
            this.ActivationModulus = ActivationModulus;
        }
    }

    public static void addAntimatterRecipes() {
        ArrayList<MagneticStabilization> MagneticStabilization_List = new ArrayList<>();
        ArrayList<GravityStabilization> GravityStabilization_List = new ArrayList<>();
        ArrayList<ContainmentStabilization> ContainmentStabilization_List = new ArrayList<>();
        ArrayList<ActivationStabilization> ActivationStabilization_List = new ArrayList<>();

        MagneticStabilization_List.add(
            new MagneticStabilization(
                // water
                FluidRegistry.getFluidStack("water", 1),
                1));

        MagneticStabilization_List.add(
            new MagneticStabilization(
                // Molten Purified Tengam
                FluidRegistry.getFluidStack("molten.tengampurified", 1),
                10));

        MagneticStabilization_List.add(
            new MagneticStabilization(
                // Tachyon Rich Temporal Fluid
                FluidRegistry.getFluidStack("temporalfluid", 1),
                20));

        MagneticStabilization_List.add(
            new MagneticStabilization(
                // Molten Magmatter
                FluidRegistry.getFluidStack("molten.magmatter", 1),
                30));

        GravityStabilization_List.add(
            new GravityStabilization(
                // water
                FluidRegistry.getFluidStack("water", 1),
                1));

        GravityStabilization_List.add(
            new GravityStabilization(
                // Molten SpaceTime
                FluidRegistry.getFluidStack("molten.spacetime", 1),
                5));

        GravityStabilization_List.add(
            new GravityStabilization(
                // Spatially Enlarged Fluid
                FluidRegistry.getFluidStack("spatialfluid", 1),
                10));

        GravityStabilization_List.add(
            new GravityStabilization(
                // Molten Eternity
                FluidRegistry.getFluidStack("molten.eternity", 1),
                15));

        ContainmentStabilization_List.add(
            new ContainmentStabilization(
                // water
                FluidRegistry.getFluidStack("water", 1),
                1));

        ContainmentStabilization_List.add(
            new ContainmentStabilization(
                // Molten Shirabon
                FluidRegistry.getFluidStack("molten.shirabon", 1),
                5));

        ContainmentStabilization_List.add(
            new ContainmentStabilization(
                // Molten Magnetohydrodynamically Constrained Star Matter
                FluidRegistry.getFluidStack("molten.magnetohydrodynamicallyconstrainedstarmatter", 1),
                10));

        ActivationStabilization_List.add(
            new ActivationStabilization(
                // water
                FluidRegistry.getFluidStack("water", 1),
                1));

        ActivationStabilization_List.add(
            new ActivationStabilization(
                // Naquadah Based Liquid Fuel MkV (Depleted)
                FluidRegistry.getFluidStack("naquadah based liquid fuel mkv (depleted)", 1),
                5));

        ActivationStabilization_List.add(
            new ActivationStabilization(
                // Naquadah Based Liquid Fuel MkVI (Depleted)
                FluidRegistry.getFluidStack("naquadah based liquid fuel mkvi (depleted)", 1),
                10));

        MagneticStabilization[] Magnetic = MagneticStabilization_List.toArray(new MagneticStabilization[0]);
        GravityStabilization[] Gravity = GravityStabilization_List.toArray(new GravityStabilization[0]);
        ContainmentStabilization[] Containment = ContainmentStabilization_List.toArray(new ContainmentStabilization[0]);
        ActivationStabilization[] Activation = ActivationStabilization_List.toArray(new ActivationStabilization[0]);

        for (MagneticStabilization MagneticList : Magnetic) {
            for (GravityStabilization GravityList : Gravity) {
                for (ContainmentStabilization ContainmentList : Containment) {
                    for (ActivationStabilization ActivationList : Activation) {
                        int Modulus = MagneticList.MagneticModulus * GravityList.GravityModulus
                            * ContainmentList.ContainmentModulus
                            * ActivationList.ActivationModulus;
                        GTValues.RA.stdBuilder()
                            .fluidInputs(
                                // Semi-Stable Antimatter
                                FluidRegistry.getFluidStack("antimatter", 1),
                                MagneticList.MagneticFluid,
                                GravityList.GravityFluid,
                                ContainmentList.ContainmentFluid,
                                ActivationList.ActivationFluid)
                            .fluidOutputs(
                                // Semi-Stable Antimatter
                                FluidRegistry.getFluidStack("antimatter", Modulus))
                            .duration(Modulus * SECONDS)
                            .eut(RECIPE_UV)
                            .addTo(AntimatterRecipes);
                    }
                }
            }
        }
    }
}

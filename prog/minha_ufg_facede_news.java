public interface NewsRepository {

    /**
     * pesquisa noticias
     * @param region {Region} objeto que contem as URL's necessarias para a pesquisa
     * @param callback {NewsCallback} callback quando existem ou não resultados
     */
    void queryNewsByRegionalUri(Region region, NewsCallback callback);

    /**
     * pesquisa por paginas de noticias
     * @param region {Region} objeto que contem as URL's necessarias para a pesquisa
     * @param pageNum {int} pagina a ser requisitada
     * @param callback {NewsCallback} callback quando existem ou não resultados
     */
    void queryNewsByRegionalUriAndPageNumber(Region region, int pageNum, NewsCallback callback);

    interface NewsCallback {
        void onSuccess(ArrayList<NewsStory> result);
        void onError(FailedToGetResultException exception);
    }

}